import java.util.*;
class VParanthesis
{
    public static boolean isValid(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            //Opening condition
            if(ch == '(' || ch == '{' || ch == '[')
            {
                s.push(ch);
            }
            else
            {
                //Closing   agar stack khali hai mtlb sb closing braces hai mtlb invalid
                if(s.isEmpty())
                {
                    return false;
                }
                if((s.peek() == '(' && ch == ')') //()  // agar koi bhi pair match huaa usko pop kr denge
                ||(s.peek() == '{' && ch == '}') //{}
                ||(s.peek() == '[' && ch == ']') ) //[]
                {
                    s.pop();
                }
                else
                {
                    return false; //agar pair match na huaa to invalid hi hoga
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        String str = "(({[[]]})";
        boolean ans = isValid(str);
        System.out.println(ans);
    }
}