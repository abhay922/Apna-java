class RotatedArrRecurssion
{
    public static int index2(int arr[],int target,int si,int ei)
    {
        if(si > ei)
        {
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == target)
        {
            return mid;
        }

        // check  for left part
        if(arr[si] <= arr[mid])
        {
            if(target >= arr[si] && target < arr[mid])
            {
               return index2(arr,target,si,mid-1);
            }
            else
            {
                return index2(arr,target,mid+1,ei);
            }
        }
        else
        {
            if(target > arr[mid] && target <= arr[ei])
            {
                return index2(arr,target,mid+1,ei);
            }
            else
            {
                return index2(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(index2(arr,target,0,arr.length-1));
    }
}