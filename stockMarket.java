import java.util.*;
class stockMarket
{
    public static int maxProfit(int price[])
    {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<price.length; i++)
        {
            if(price[i] > buyprice)
            {
                int profit = price[i] - buyprice; // Today's profit
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[])
    {
        int price[] = {7,1,5,3,6,4};
        int Maal = maxProfit(price);
        System.out.println("Max maal earned from stock market is:" + Maal);
    }
}

// public static int MaxProfit(int price[])
// {
//     minBuyPrice = Integer.MAX_VALUE;
//     maxProfit = 0;
//     for(int i=0; i<price.length; i++)
//     {
//         if(price[i] > minBuyPrice)
//         {
//             profit = price[i] - minBuyPrice;
//             maxProfit = Math.max(profit,maxProfit);
//         }
//         else
//         {
//             minBuyPrice = price[i];
//         }
//     }
//     return 0;
// }