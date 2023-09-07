import java.util.Arrays;
import java.util.HashMap;

//class Solution
//{
//    public int[] twoSum(int[] nums, int target)
//    {
//        int i;
//        int j;
//        for (i = 0; i < nums.length - 1; i++)
//        {
//            for (j = i + 1; j < nums.length; j++)
//            {
//                if (target == nums[i] + nums[j])
//                {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{0};
//    }
//}


class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        //新建hash表（数组内容，数组下标）
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            //要先判断是否包含，否则会出现某个值为target的一半时，返回两个相同下标的情况
            //eg.nums =[3,2,4] target=6 返回值为[0,0],因为3+3=6
            //如果hash表的key包含target-nums[i]
            if (hash.containsKey(target - nums[i]))
            {
                //返回(target-num[i]的下标，i)
                return new int[]{hash.get(target - nums[i]), i};
            }

            //遍历数组读入hash表
            hash.put(nums[i], i);
        }
        return new int[]{0};
    }
}

public class TwoSum
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        int[] a = {3, 2, 4};
        System.out.println(Arrays.toString(s.twoSum(a, 6)));
    }
}

