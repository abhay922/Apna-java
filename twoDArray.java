// import java.util.*;
// //import java.util.Scanner;
// class twoDArray
// {
//     public static int search(int matrix[][])
//     {
//         int largest = matrix[0][0];
//         for(int i=0; i<matrix.length; i++)
//         {
//             for(int j=0; j<matrix[0].length; j++)
//             {
//                 if(matrix[i][j] > largest)
//                     largest =  matrix[i][j];
//             }
//         }
//         return largest;
//     }


//     public static void main(String args[])
//     {
//         int matrix[][] = new int[3][3];
//         //int key = 5;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter elements");
//         for(int i=0; i<matrix.length; i++)
//         {
//             for(int j=0; j<matrix[0].length; j++)
//             {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         //output
//         // for(int i=0; i<matrix.length; i++)
//         // {
//         //     for(int j=0; j<matrix.length; j++)
//         //     {
//         //         System.out.print(matrix[i][j] +" ");
//         //     }
//         //     System.out.println();
//         // }

//         System.out.println("Largest element: " + search(matrix));

//     }
// }
