class Backtracking
{
    public static void trackArr(int arr[],int i,int val)
    {
        //base case
        if(i == arr.length)
        {
            printArr(arr);
            return;
        }
        //recursion bala kaam
        arr[i] = val;
        trackArr(arr,i+1,val+1);
        arr[i] = arr[i]-2;
    }
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = new int[5];
        trackArr(arr,0,1);
        printArr(arr);
    }
}