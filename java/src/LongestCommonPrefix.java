public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        String[] strs1 = {"a"};
        String[] strs2 = {"flower", "flow", "flight"};
        String[] strs3 = {"dog", "racecat", "car"};
        longestCommonPrefixSolution s = new longestCommonPrefixSolution();
        System.out.println(s.longestCommonPrefix(strs3));
    }
}

class longestCommonPrefixSolution
{
    public String longestCommonPrefix(String[] strs)
    {
        for (int i = 1; i < strs[0].length() + 1; i++)
        {
            String pre = strs[0].substring(0, i);//截取子串作为前缀
            for (String s : strs)
            {
                if (!s.startsWith(pre))
                {
                    return pre.substring(0, i - 1);//如果不匹配就返回不要最后一个字符的前缀
                }
            }
        }
        return strs[0];//循环完说明该字符串本身就是最长前缀
    }
}
