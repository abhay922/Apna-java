public class Oops
{
    public static void main(String args[])
    {
        // Pen p1 = new Pen(); // created a pen object called p1
        // p1.setColor("blue");
        // p1.setPrice(5);
        // System.out.println(p1.getColor());
        //System.out.println(p1.getTip);

        BankAccount b1 = new BankAccount();
        b1.username = "Abhay";
         
        System.out.println(b1.username);
        b1.setPassword("kjdfjf");
        b1.getPassword();
    }
}

class BankAccount 
{
    String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
        //return password;
    }
    public void getPassword()
    {
        System.out.println(this.password);
    }
}


// class Pen
//     {
//         private String color;
//         private int price;

//         String getColor()
//         {
//             return this.color;
//         }
//         void setColor(String newColor)
//         {
//             color = newColor;
//         }
//         void setPrice(int newPrice)
//         {
//             price = newPrice;
//         }