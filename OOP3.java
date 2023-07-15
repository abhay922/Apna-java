class OOP3
{
    public static void main(String args[])
    {
        // King k = new King();
        // k.moves();

        AllInOne obj = new AllInOne();
        obj.eat();
        obj.danav();
    }
}


// //INTERFACE
// interface ChessPlayer
// {
//     void moves();
// }
// class Queen implements ChessPlayer
// {
//     public void moves() // we will have to mention public here otherwise it became default
//     {
//         System.out.println("up,down,left,right,diagonal(in all direction)");
//     }
// }
// class Rook implements ChessPlayer
// {
//     public void moves()
//     {
//         System.out.println("up,down,left,right");
//     }
// }
// class King implements ChessPlayer
// {
//     public void moves()
//     {
//         System.out.println("up,down,left,right,diogonal(by one step)");
//     }
// }




// mULTIPLE INTERFACE USING INTERFACE
interface Vegeterian
{
    //System.out.println("Eat only ghas phus:");
    void eat();
}
interface NonVegeterian
{
    //System.out.println("Eat kidni, phefra,leg and alllll");
    void danav();
}
class AllInOne implements Vegeterian,NonVegeterian
{
    public void eat()
    {
        System.out.println("Eat kidni, phefra,leg and alllll");

    }
    public void danav()
    {
        System.out.println("Can eat anything:");
    }
}
