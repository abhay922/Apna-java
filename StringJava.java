import java.util.*;
class StringJava
{
    // public static void printLetter(String name)
    // {
    //     for(int i=0; i<name.length(); i++)
    //     {
    //         System.out.print(name.charAt(i)+" ");
    //     }
    // }

    // public static boolean palindrome(String name)
    // {
    //     int n = name.length();
    //     for(int i=0; i<n/2; i++)
    //     {
    //         if(name.charAt(i) != name.charAt(n-1-i))
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

        // public static void main(String args[])
        // {
        //     StringBuilder sb = new  StringBuilder("");
        //     for(char ch='a'; ch<='z'; ch++)
        //     {
        //         sb.append(ch);
        //     }
        //     System.out.println(sb);
        // }



    // public static String toUpperCase(String name)
    // {
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(name.charAt(0));
    //     sb.append(ch);
    //     for(int i=1; i<name.length(); i++)
    //     {
    //         if(name.charAt(i) == ' ' && i<name.length()-1)
    //         {
    //             sb.append(name.charAt(i)); // add space in stringBuilder sb
    //             i++;
    //             sb.append(Character.toUpperCase(name.charAt(i)));
    //         }
    //         else
    //         {
    //             sb.append(name.charAt(i));
    //         }
    //     }
    //     return sb.toString();

    // }

        public static String stringCompression(String str)
        {
            String newStr = "";
           
           for(int i=0; i<str.length(); i++)
           {
            Integer count = 1;
                while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
                {
                    count++;
                    i++;
                }
                newStr += str.charAt(i);
                if(count > 1)
                {
                    newStr += count.toString();
                }
           }
           return newStr;
        }







    public static void main(String args[])
    {
            String str = "ababcacb";
    //     // String str = "Abhay";
    //     // String str2 = new String("Singh");
    //     // System.out.println(str+" " +str2);


    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter string value:");
    //     String  name = sc.nextLine();
    //     // System.out.println(name + " " + name.length());
    //     //System.out.println(name.charAt(0));
    //     //printLetter(name);
    //     //System.out.println(palindrome(name));
    //     //System.out.println(toUpperCase(name));
            System.out.println(stringCompression(str));

    }
    
}











// public static String toUpperCase(String args[])
// {
//     String name = "";
//     StringBuilder sb = new StringBuilder("");
//     char ch = Character.toUpperCase(name.charAt(0));
//     sb.append(ch);
//     for(int i=1; i<name.length(); i++)
//     {
//         if(name.charAt(i) == ' ')
//         {
//             sb.append(name.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(name.charAt(i)));
//         }
//         else{
//             sb.append(name.charAt(i));
//         }
//     }
//     return sb.toString();


// }