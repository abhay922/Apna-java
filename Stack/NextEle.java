import java.util.*;
class NextEle
{
    //1 while
    //2 if-else
    //push in s

    //static int nextE[];
    public static void nextElement(int arr[])
    {
        Stack<Integer> s = new Stack<>();
        //nextE = new int[arr.length];
        int nextE[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--)
        {
            //step 1
            while(!s.isEmpty() && arr[i] >= arr[s.peek()])
            {
                s.pop();
            }
            //step 2
            if(s.isEmpty())
            {
                nextE[i] = -1;
            }
            else
            {
                nextE[i] = arr[s.peek()];
            }
            //push in s
            s.push(i);
        }
        print(nextE);
    }
    public static void print(int nextE[])
    {
        for(int i=0; i<nextE.length; i++)
        {
            System.out.print(nextE[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {6,8,0,1,3};
        nextElement(arr);
        //print();
    }
}


//next greater Right
//next greater Left
//next smaller Right
//next smaller Left