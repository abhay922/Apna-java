class NumToStr
{
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int num)
    {
        if(num == 0)
        {
            return;
        }
        int lastDig = num%10;
        printDigits(num/10);
        System.out.print(digits[lastDig]+" ");
        //printDigits(lastDig);
        
    }
    public static void main(String args[])
    {
        int num = 54954780;
        printDigits(num);
        System.out.println();
    }
}