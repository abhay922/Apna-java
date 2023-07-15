class TilingProb
{
    public static int tillingProblem(int n) // 2 * n floor size
    {
        //base case
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //kaam 
        //place tiles vertical
        int vt = tillingProblem(n-1);

        //place horizontal
        int hz = tillingProblem(n-2);
        int TotalWays = vt + hz;
        return TotalWays;
    }
    public static void main(String args[])
    {
        System.out.println(tillingProblem(3));
    }
}