class GfG {
 
    // function that will
    // calculate the factorial
    static long factorial(int N)
    {
        int result = 1;
        while (N > 0) {
            result = result * N;
            N--;
        }
        return result;
    }
 
    static long countWays(int N)
    {
        long total = factorial(N + N-2);
        long total1 = factorial(N-1);
        return (total / total1) / total1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int N = 3;
        System.out.println("Ways = " + countWays(N));
    }
}