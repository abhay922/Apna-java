class Permutations
{
    public static void PrintPrmutations(String str,String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        // PrintPrmutations(str,ans+str.charAt(i+1),i+1);
        for(int i=0; i<str.length(); i++)
        {
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde" ......we removed c
            String newStr = str.substring(0,i) + str.substring(i+1); // here we make new string beacuse if we change in same string then loop will not run till last
            PrintPrmutations(newStr,ans+curr);
        }
    }
    public static void main(String args[])
    {
        String str = "abc";
        PrintPrmutations(str,"");
    }
}

//T.C = O(n*n!)