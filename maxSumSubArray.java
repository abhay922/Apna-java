import java.util.*;
class maxSumSubArray
{
    public static void maxSumUsingPrefix(int marks[])
    {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[marks.length];
        prefix[0] = marks[0];
        for(int i=1; i<prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + marks[i];
        }

        for(int i=0; i<marks.length; i++)
        {
            int start = i;
            for(int j=i; j<marks.length; j++)
            {
                int end = j;
                // if(start == 0)
                // {
                //     currsum = prefix[end];
                // }
                // else
                // {
                //     currsum = prefix[end] - prefix[start-1];
                // }
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currsum)
                {
                    maxSum = currsum;
                }
                
            }
        }
        System.out.println("Max sum of subarray is:" +maxSum);
    }
    public static void main(String args[])
    {
        int marks[] = {1,-2,6,-1,3};
        maxSumUsingPrefix(marks);
    }
}