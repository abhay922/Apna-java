class apnaArrayQ
{

    // public static boolean trueFalse(int nums[])
    // {
    //     int n = nums.length;
    //     for(int i=0; i<n; i++)
    //     {
    //         for(int j=i+1; j<n; j++)
    //         {
    //             if(nums[i] == nums[j])
    //                 return true;
    //         }
    //     }
    //     return false;
    // }

    public static int SearchinrotatedArray(int nums[],int target)
    {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            if(nums[i] == target)
                return i;
        }
        return -1;
    }


    public static void main(String args[])
    {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        //System.out.println(trueFalse(nums));  //This one is Q1
        System.out.println(SearchinrotatedArray(nums,target));
    }
}