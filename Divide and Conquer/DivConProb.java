class DivConProb
{
    public static String[] mergeSortOnString(String[] arr,int si,int ei)
    {
        if(si == ei)
        {
            String[] A = {arr[si]};
            return A;
        }
        int mid = si+(ei-si)/2;
        String[] arr1 = mergeSortOnString(arr,si,mid);
        String[] arr2 = mergeSortOnString(arr,mid+1,ei);
        String arr3[] = merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String[] arr1,String[] arr2)
    {
        int i=0;
        int j=0;
        int idx = 0;
        String[] arr3 = new String[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length)
        {
            if(isAlpabaticallySmaller(arr1[i],arr2[j]))
            {
                arr3[idx++] = arr1[i++];
            }
            else
            {
                arr3[idx++] = arr2[j++];
            }
        }
       while (i < arr1.length)
        {
            arr3[idx++] = arr1[i++];
        }

        while (j < arr2.length)
        {
            arr3[idx++] = arr2[j++];
        }
        return arr3;
    }
    //check which string is appears aplhabetically
    public static boolean isAlpabaticallySmaller(String str1,String str2)
    {
        if(str1.compareTo(str2) < 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        String arr[] = {"sun","earth","mars","mercury"};
        String[] res = mergeSortOnString(arr,0,arr.length-1);
        for(int i=0; i<res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
        

    }
}
