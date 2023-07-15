class Classroom
{
    public static void findAllSubSets(String str,String ans,int i)
    {
        //base case
        if(i == str.length())
        {
            if(ans.length() == 0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(ans);
                //return;
            }
            return;
        }
        //yes bali choice
        findAllSubSets(str,ans+str.charAt(i),i+1);
        //no bali choice
        findAllSubSets(str,ans,i+1);
    }
    public static void main(String args[])
    {
        String str = "abc";
        findAllSubSets(str,"",0);
    }
}