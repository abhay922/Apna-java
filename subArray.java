import java.util.*;
class subArray
{
    // public static void findMaxSum(int nums[]) //FIND MAX SUBARRAY SUM USING PREFIX SUM 
    // {
    //     int n = nums.length;
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[n];
    //     prefix[0] = nums[0];
    //     //calculate prefix array
    //     for(int i=1; i<prefix.length; i++)
    //     {
    //         prefix[i] = prefix[i-1] + nums[i];
    //     }

    //     for(int i=0; i<n; i++)
    //     {
    //         int start = i;
    //         for(int j=i; j<n; j++)
    //         {
    //             int end = j;
    //             if(start == 0)
    //             {
    //                 currSum = prefix[end];
    //             }
    //             else
    //                 currSum = prefix[end] - prefix[start-1];
    //             if(maxSum < currSum)
    //             {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("Max sum :" +maxSum);
    // }
    public static void kadanes(int nums[])
    {
        // int min = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++)
        // {
        //     if(nums[i] < 0)
        //     {
        //         min = Math.max(nums[i],min);
        //     }
        // }
        // System.out.println("Max value is:" + min);
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<nums.length; i++)
        {
            cs = cs +nums[i];
            ms = Math.max(cs,ms);
            if(cs < 0)
            {
                cs = 0;
            }
            // cs = cs + nums[i];
            // if(cs < 0)
            // {
            //     cs = 0;
            // }
            // ms = Math.max(cs,ms);
        }
        System.out.println("Max sum :" + ms);
        
    }
    
    public static void main(String args[])
    {
        int nums[] = {-1,-2,-6,-1,-3};
        kadanes(nums);

    }
}