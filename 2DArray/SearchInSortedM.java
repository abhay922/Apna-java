class SearchInSortedM
{
    //FOR RIGHT CORNER SHELL
    // public static boolean stairCase(int matrix[][],int key)
    // {
    //     int row=0;
    //     int col = matrix[0].length-1;
    //     while(row<matrix.length && col>=0)
    //     {
    //         if(matrix[row][col] == key)
    //         {
    //             System.out.println("Element found at (" + row + "," + col +")");
    //             return true;
    //         }
    //         else if(matrix[row][col] > key)
    //         {
    //             col--;
    //         }
    //         else
    //         {
    //             row++;
    //         }
    //     }
    //     System.out.println("Elements not found:");
    //     return false;

    public static boolean stairCase(int matrix[][],int key)
    {
        int row=matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix.length)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("Element found at (" + row + "," + col +")");
                return true;
            }
            else if(matrix[row][col] > key)
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.println("Elements not found:");
        return false;



    }
    public static void main(String args[])
    {
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        int key=39;
        stairCase(matrix,key);
    }
}