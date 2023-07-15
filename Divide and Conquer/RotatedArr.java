class RotatedArr
{
    public static int index(int arr[],int target)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = 0;
        if(start > end)
        {
            return -1;
        }
        while(start <= end)
        {
            mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else
            {
                if(arr[start] <= arr[mid])
                {
                    if(target >= arr[start] && target <= arr[mid])
                    {
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
                else
                {
                    if(target >= arr[mid] && target <= arr[end])
                    {
                        start = mid+1;
                    }
                    else
                    {
                        end = mid-1;
                    }
                }
            }
        }
        return mid;

    }
    public static void main(String args[])
    {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(index(arr,target));
    }
}