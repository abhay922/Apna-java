class BinString
{
    public static void binString(int strLen,int lastDig,String str)
    {
        if(strLen == 0)
        {
            System.out.println(str);
            return;
        }
        binString(strLen-1,0,str+"0");
        if(lastDig == 0) // if last digit will be zero then we will insert 1
        {
            binString(strLen-1,1,str+"1");
        }
    }
    public static void main(String args[])
    {
        binString(3,0,"");
    }
}