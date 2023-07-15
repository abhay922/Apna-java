// public static int trapedWater()
// {
//     int leftMax[] = new int[];
//     int rightMax[] = new int[];
//     leftMax[0] = nums[0];
//     rightMax[n-1] = nums[n-1];
//     for(int i=1; i<nums.length; i++)
//     {
//         leftMax[i] = Math.max(nums[i],leftMax[i-1]);
//     }

//     for(int i=nums.length-2; i>=0; i--)
//     {
//         rightMax[i] = Math.max(nums[i],nums[i+1]);
//     }
// }

//BUY AND SELL STOCKS
int buyP = Integer.MAX_VALUE;
int profit = 0;
int maxP = 0;
for(int i=0; i<price.length; i++)
{
    
    // if(price[i] < buyP)
    // {
    //     buyP = price[i];
    // }
    // profit = price[i]-buyP;
    // maxP = Math.max(maxP,profit);
    if(buyP < price[i])
    {
        profit = price[i]-buyP;
        maxP = Math.max(maxP,profit);
    }
    else{
        buyP = price[i];
    }
}
return maxP;

