import java.util.*;
class apnaAarray
{
    // public static void main(String args[])
    // {
    //     int marks[] = {23,34,56,67,78,89,34,87,233,12};
    //     int key = 23;
    //     for(int i=0; i<marks.length; i++)
    //     {
    //         if(marks[i] == key)
    //         {
    //             System.out.println(i);
    //             //return i;
    //         }
    //     }
    //     //return -1;
    // }

    // public static int apnaLinearSearach(int marks[],int key)
    // {
    //     //int key = 12;
    //     for(int i=0; i<marks.length; i++)
    //     {
    //         if(marks[i] == key)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
    //}
    // for - infinity Integer.MIN_VALUE;
    // for + infinity Integer.MAX_VALUE;

    // public static void reverseArray(int marks[])
    // {
    //     int start = 0;
    //     int end = marks.length-1;
    //     while(start < end)
    //     {
    //         int temp = marks[start];
    //         marks[start] = marks[end];
    //         marks[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }


    public static void pairArray(int marks[])
    {
        int Totalsubarray = 0;
        for(int k=0;k<=marks.length-1;k++){
            for(int i=k; i<=marks.length-1; i++)
            {
                for(int j=k; j<=i; j++)
                {
                    System.out.print(marks[j]+" ");
                    
                    // Totalsubarray++;
                }
                Totalsubarray++;
               System.out.println();
            }
           System.out.println();
        }
        System.out.println("Total number of subarray is:" + Totalsubarray);
        
    }



    public static void main(String args[])
    {
        int marks[] = {1,2,3,4,5,6};
        pairArray(marks);

        // reverseArray(marks);
        // for(int i=0; i<marks.length; i++)
        // {
        //     System.out.print (marks[i]+ " ");
        // }
        // System.out.println();


        // int key = 233;
        // int result = apnaLinearSearach(marks,key);
        // if(result == -1)
        // {
        //     System.out.println("Element not found:");
        // }
        // else
        // {
        //     System.out.println("Element found at position:" +result);
        // }
    }
}