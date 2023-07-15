public class oops2
{
    public static void main(String args[])
    {
        horse obj = new horse();
    }
}
abstract class Animal{
    Animal()
    {
        System.out.println("Class1 constructor");
    }
    void eat()
    {
        System.out.println("Animal eat1");
    }

}
class dog extends Animal
{
    dog()
    {
        System.out.println("Class2 constructor");
    }
}
class horse extends dog
{
    horse()
    {
        System.out.println("Class3 constructor");
    }
}