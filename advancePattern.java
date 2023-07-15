class advancePattern
{
    // public static void hollow(int totalRow,int totalColom)
    // {
        // for(int row=1; row<=totalRow; row++)
        // {
        //     for(int colom=1; colom<=totalColom; colom++)
        //     {
        //         if(row==1 || row ==totalRow || colom == 1 || colom == totalColom )
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


            // public static void halfRotatedPyramid(int totalRow)
            // {
            //     for(int row=1; row<=totalRow; row++)
            //     {
            //         //This for loop for space
            //         for(int col=1; col<=totalRow-row; col++)
            //         {
            //             System.out.print(" ");
            //         }
            //         //This for loop is for star*
            //         for(int col=1; col<=row; col++)
            //         {
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }
            // }
                // public static void invertedHalfPyramidNum(int n)
                // {
                //     for(int i=1; i<=n; i++)
                //     {
                //         for(int j=1; j<=n-i+1; j++)
                //         {
                //             System.out.print(j+" ");
                //         }
                //         System.out.println();

                //         //for(int j=1; j<=n; j++)

                //     }
                //     // System.out.println();
                // }

                // public static void floydTringle(int n)
                // {
                //     int counter=1;
                //     for(int i=1; i<=n; i++)
                //     {
                //         for(int j=1; j<=i; j++)
                //         {
                //             System.out.print(counter + " ");
                //             counter++;
                //         }
                //         System.out.println();
                //     }
                // }

               // public static void ZeroOneTriangle(int n)
                //{
                    // for(int i=1; i<=n; i++)
                    // {
                    //     // int zero = 0;
                    //     // int one = 1;
                    //     for(int j=1; j<=i; j++)
                    //     {
                    //         if((i+j) % 2 == 0)
                    //         {
                    //             System.out.print(1);
                    //         }
                    //         else
                    //         {
                    //             System.out.print(0);
                    //         }
                            // if(i%2 == 0)
                            // {
                            //     System.out.print(zero);
                            //     //zero++;
                            // }
                            // else{
                            //     System.out.print(one);
                            //     //one++;
                            // }
                //         }
                //         System.out.println();
                //     }
                // }

                public static void butterFlyPatt(int n)
                {
                    //outer loop for number of lines.
                    for(int i=1; i<=n; i++)
                    {
                        // stars
                        for(int j=1; j<=i; j++)
                        {
                            System.out.print("*");
                        }
                        //space
                        for(int j=1; j<=2*(n-i); j++)
                        {
                            System.out.print(" ");
                        }
                        for(int j=1; j<=i; j++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    // 2nd part
                //     for(int i=n; i>=1; i--)
                //     {
                //         // for(int j=n; j>=i; j--)
                //         // {
                //         //     System.out.print("*");
                //         // }
                //         // for(int j=n; j>=1; j--)
                //         // {
                //         //     System.out.print(" "); 
                //         // }
                //         // for(int j=n; j>=i; j--)
                //         // System.out.println(" ");


                //         //for stars.
                //         for(int j=1; j<=i; j++)
                //         {
                //             System.out.print("*");
                //         }
                //         //space
                //         for(int j=1; j<=2*(n-i); j++)
                //         {
                //             System.out.print(" ");
                //         }
                //         //Stars.
                //         for(int j=1; j<=i; j++)
                //         {
                //             System.out.print("*");
                //         }
                //         System.out.println();
                //     }
                for(int i=1; i<=n; i++)
                {
                    // stars
                    for(int j=1; j<=n-i+1; j++)
                    {
                        System.out.print("*");
                    }
                    //space
                    for(int j=1; j<=2*(i-1); j++)
                    {
                        System.out.print(" ");
                    }
                    // again star
                    for(int j=1; j<=n-i+1; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            

    public static void main(String args[])
    {
        //hollow(4,5);
       // halfRotatedPyramid(15);
       //invertedHalfPyramidNum(5);
    //    floydTringle(5);
      // ZeroOneTriangle(5);
      butterFlyPatt(4);
    }
}