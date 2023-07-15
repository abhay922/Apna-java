import java.util.*;
class Bbreak
{
    public static void main(String args[])
    {
        //int i=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter numbers:");
            int n = sc.nextInt();
            if(n % 10 == 0)
            {
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}