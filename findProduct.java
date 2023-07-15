class findProduct
{
    // public static int apnaProduct(int a, int b)
    // {
    //     int product = a*b;
    //     return product;
    // }
    // public static int apnaFactorial(int n)
    // {
    //     int fact=1;
    //     for(int i=1; i<=n; i++)
    //     {
    //         fact = fact*i;
    //     }
    //     return fact;
    // }
    // public static boolean isPrime(int n)
    // {
    //     if(n == 2)
    //     {
    //         return true;
    //     }
    //     for(int i=2; i<=Math.sqrt(n); i++)
    //     {
    //         if(n % i == 0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void primeInRange(int b)
    // {
    //     for(int i=2; i<=b; i++)
    //     {
    //         if(isPrime(i))
    //         {
    //             System.out.print(i+" ");
    //         }
    //     }
    // }
    // public static void BinToDec(int binNum ) {
    //     int myNum = binNum;
    //     int deciMal = 0;
    //     int pow = 0;
    //     //for(int i=0; i<=n; i++)
    //     while(binNum>0)
    //     {
    //         int lastDig = binNum % 10;
    //         deciMal = deciMal + (lastDig * (int)Math.pow(2,pow));
    //         pow++;
    //         binNum = binNum/10;
    //     }
    //     System.out.println("Decimal of " + myNum + " = " + deciMal);
    //}
    public static void DeciToBin(int deciNum)
    {
        int myNum = deciNum;
        int pow = 0;
        int binNum = 0;
        while(deciNum>0)
        {
           int rem = deciNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
           deciNum = deciNum/2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }

    public static void main(String args[])
    {
    //    int result = apnaProduct(3,5);
    //    System.out.println("Answer:" + result);
    //    int res = apnaFactorial(7);
    //    System.out.println("Answer:" + res);
       // System.out.println(isPrime(100));
       // primeInRange(100);
        //BinToDec(111);
        DeciToBin(15);
    }
}
