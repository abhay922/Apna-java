import java.util.*;
class PushAtBottom
{
    //QUESTION 1 push at bottom
    public static void pushAtB(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtB(s,data);
        s.push(top);
    }
    //QUESTION 3 REVERSE STACK
    public static void revStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return; // qki empty stack always reverse hota hai
        }
        int top = s.pop();
        revStack(s); // recursion call
        pushAtB(s,top); // push at bottom
    }
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3); // 3 , 2, 1
        //pushAtB(s,4);
        revStack(s);
        while(!s.isEmpty())
        {
            System.out.println(s.pop()+" ");
           // s.pop();
        }
    }
}