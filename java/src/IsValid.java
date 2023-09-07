import java.util.EmptyStackException;
import java.util.Stack;

public class IsValid
{
    public static void main(String[] args)
    {
        System.out.println(isValid("]"));
    }

    static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (char i : array)
        {
            try
            {
                if (i == '(' || i == '[' || i == '{')
                {
                    stack.push(i);
                }
                else if (i == ')' && stack.peek() == '(')
                {
                    stack.pop();
                }
                else if (i == ']' && stack.peek() == '[')
                {
                    stack.pop();
                }
                else if (i == '}' && stack.peek() == '{')
                {
                    stack.pop();
                }

                else
                {
                    return false;
                }
            }
            catch (EmptyStackException e)
            {
                return false;
            }

        }

        return stack.isEmpty();
    }
}
