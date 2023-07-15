class Recursion
{
    //PRINT 5 T0 1
    // public static void print(int n)
    //     {
           
    //         if(n == 1)
    //         {
    //             System.out.println(n+" ");
    //             return;
    //         }
    //         print(n-1);
    //         System.out.print(n +" ");
            
    //     } 

    //     public static void main(String args[])
    //     {
    //         int n=10;
    //         print(10);
    //     }

    // FACTORIAL 
    // public static int FindFact(int n)
    // {
    //     int fact = 1;
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     fact = n * FindFact(n-1);
    //     return fact;
    // }
    // public static void main(String args[])
    // {
    //     //int n = 5;
    //     System.out.println(FindFact(12));
    // }



    // CHECK IF A GIVEN ARRAY IS SORTED OR NOT
    // public static boolean IsSorted(int arr[],int i)
    // {
    //     if(i == arr.length-1)
    //     {
    //         return true;
    //     }
    //     if(arr[i] < arr[i+1])
    //     {
    //         //System.out.println("Sorted");
    //         //IsSorted(arr,i+1);
    //         return false;
    //     }
    //     return IsSorted(arr,i+1);
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {5,4,3,2,1,6};
    //     System.out.println(IsSorted(arr,0));
    // }


    //  FIRST OCCURANCE OF AN ELEMENT
//     public static int FirstOcrnc(int arr[],int key,int i)
//     {
//        int count = 0;
//        if(i == arr.length)
//        {
//             return -1;
//        }
//         if(arr[i] == key)
//         {
//             //return i;
//             count++;
//         }
//         return FirstOcrnc(arr,key,i+1);
       
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {2};
//         System.out.println(FirstOcrnc(arr,5,0));
//     }


// LAST OCCURANCE OF AN ELEMENT IN AN ARRAY
// public static int LastOcrnc(int arr[],int key,int i)
//     {
//        if(i == arr.length)
//        {
//             return -1;
//        }
//        int isFound = LastOcrnc(arr,key,i+1);
//        if(isFound == -1 && arr[i] == key)
//        {
//             return i;
//        }

//       return isFound; 
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {2,2,2,2,2};
//         System.out.println(LastOcrnc(arr,2,0));
//     }



}