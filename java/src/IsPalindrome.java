public class IsPalindrome
{
    public static void main(String[] args)
    {
        Solution2 s1 = new Solution2();
        int x1 = 121;
        int x2 = 123;
        int x3 = 10;
        System.out.println(s1.isPalindrome(x1));
        System.out.println(s1.isPalindrome(x2));
        System.out.println(s1.isPalindrome(x3));
    }
}

//转为字符串来判断
class Solution1
{
    public boolean isPalindrome(int x)
    {
        String s = Integer.toString(x);
        //反转字符串
        String rever = new StringBuilder(s).reverse().toString();
        return rever.equals(s);
    }
}

//用数字来判断
class Solution2
{
    public boolean isPalindrome(int x)
    {
        if (x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }
        //mod为余数
        int mod = 0;
        while (x > mod)
        {
            //更新mod和x
            mod = (x % 10) + mod * 10;
            x /= 10;
        }
        //如果位数为偶数则mod=x，位数为奇数则mod/10=x
        return mod == x || mod / 10 == x;
    }
}