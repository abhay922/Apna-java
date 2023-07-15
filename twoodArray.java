import java.util.function.IntPredicate;

class twoodArray
{
    public static void printSpiral(int matrix[][])
    {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol)
        {
            //print top --> startRow is fixed and column vary
            for(int j=startCol; j<=endCol; j++)
            {
                System.out.print(matrix[startRow][j]+" ");
            }

            //print right --> row vary and column is fixed.
            for(int i=startRow+1; i<=endRow; i++)
            {
                System.out.print(matrix[i][endCol]+" ");
            }

            //print bottom --> column vary and endRow is fixed
            for(int j=endCol-1; j>=startCol; j--)
            {
                if(startRow == endRow)
                {
                    return;
                }
                
                System.out.print(matrix[endRow][j]+" ");
            }

            // print left --> row vary firstCol fixed
            for(int i=endRow-1; i>=startRow+1; i--)
            {
                if(startCol == endCol)
                {
                    return;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};

            printSpiral(matrix);
    }
}