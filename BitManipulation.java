import java.util.*;
public class BitManipulation
{
    // public static void oddEven(int n)
    // {
    //     int bitMask = 1;
    //     if((n & bitMask) == 0)
    //     {
    //         //even number
    //         System.out.println("Number is even:");
    //     }
    //     else
    //     System.out.println("Number is odd:");
    // }

    // public static void getIthposition(int n,int i)
    // {
    //     int bitMask = 1<<i;
    //     if((n & bitMask) == 0)
    //     {
    //         //even number
    //         System.out.println(0);
    //     }
    //     else
    //     System.out.println(1);
    // }

    // public static int setIthposition(int n,int i)
    // {
    //     int bitMask = 1<<i;
    //     return n | bitMask;
    // }

    public static int clearIthposition(int n,int i)
    {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }


    public static void main(String args[])
    {
        // oddEven(5);
        // oddEven(8);

        //getIthposition(10,2);
        // System.out.println(setIthposition(10,2));
        System.out.println(clearIthposition(10,1));
    }
}