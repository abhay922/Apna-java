import java.util.Arrays;
import java.util.*;
class VikasQue
{
    public static int missingElement(int arr[])
    {
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]-arr[i-1] == 0)
            {
                return arr[i]-1;
            }
        }
        return 0;
        // for(int i=0; i<arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,4,4,3};
        System.out.println(missingElement(arr));
    }
}