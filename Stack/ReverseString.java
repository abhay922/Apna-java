import java.util.*;
class ReverseString
{
    //QUESTION 2 reverse string
    public static String revString(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        
        //now we make a new stringBuilder to store res
        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty())
        {
            res.append(s.pop());
        }
        return res.toString();

    }
    
    public static void main(String args[])
    {
        String str = "abcd";
        // Stack<String> s = new Stack<>();
        // s.push("d");
        // s.push("c");
        // s.push("b");
        // s.push("a");
        String ans = revString(str);
        System.out.println(ans);
        // while(!s.isEmpty())
        // {
        //     System.out.println(s.pop()+" ");
        // }

    }
}