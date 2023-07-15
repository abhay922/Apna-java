class SortingArray
{
    //BUBBLE SORT

    // public static void bubbleSort(int arr[])
    // {
    //     for(int i=0; i<arr.length-1; i++)
    //     {
    //         int swap = 0;
    //         for(int j=0; j<arr.length-1-i; j++)
    //         {
    //             if(arr[j] > arr[j+1])
    //             {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //                 swap++;
    //             }
    //         }
    //         if(swap == 0)
    //         {
    //             break;
    //         }
    //     }
    // }

    //SELECTION SORT

    // public static void SelectionSort(int arr[])
    // {
    //     for(int i=0; i<arr.length-1; i++)
    //     {
    //         int minPos = i;
    //         for(int j=i+1; j<arr.length; j++)
    //         {
    //             if(arr[minPos] < arr[j])
    //             {
    //                 minPos = j;
    //             }
    //         }
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
    //     }
    // }


    //INSERTION SORT
    public static void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert using while loop
            while(prev >= 0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev]; // push the prev element one space back
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    //COUNT SORT
    // public static void countSort(int arr[])
    // {
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         largest = Math.max(largest,arr[i]);
    //     }

    //     int count[] = new int[largest+1]; // in count array   index = element of arr[]
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         count[arr[i]]++;
    //     }

    //     //Now sorting 
    //     int k = 0;
    //     for(int i=0; i<count.length; i++)
    //     {
    //         while(count[i] > 0)
    //         {
    //             arr[k] = i;
    //             k++;
    //             count[i]--;
    //         }
    //     }

    // }


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
        int arr[] = {23,31,3,56,1,7};
       //int arr[] = {1,4,1,3,2,4,3,7};
        //bubbleSort(arr);
        //SelectionSort(arr);
        insertionSort(arr);
        //countSort(arr);
        printArr(arr);
        // for(int i=0; i<arr.length; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
    }
}