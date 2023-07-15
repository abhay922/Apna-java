import java.util.*;
class lastdigit
{
    public static void main(String args[])
    {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n  = sc.nextInt();
        while(n>0)
        {
            // int lastdig = n%10;
            // System.out.print(lastdig);
            // n = n/10;
            int lastdig = n%10;
            rev = (rev*10) + lastdig;
            n = n/10;
            //System.out.print(rev);

        }
        System.out.println(rev);
    }
}

// do{
//     System.out.println("hyy");
//     i++;
// }while(i<=10);