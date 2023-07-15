class Solution {
    
    //  Time Complexity = O(N*N)
    //  Space Complexity = O(1)
    
    public static int[] replaceElements(int[] arr) {
        
        //  Traversing the array till array length -1
        for(int i = 0 ; i < arr.length - 1; i++){
            int max = 0;                    
            
            //  max variable to store the max value to the right of the element
            //  traversing the right side of the element i
            for(int j = i+1; j < arr.length ; j++ ){
                max = Math.max(max,arr[j]);         //  updating the max value each time
            }
            arr[i] = max;   // updating the element i with the greatest element among the elements to its right
        }
        arr[arr.length - 1] = -1;       //  Updating the last element with -1 value
        
        return arr;
    }
    public static  void main(String args[])
    {
        int arr[] = {17,18,5,4,6,1};
        replaceElements(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}