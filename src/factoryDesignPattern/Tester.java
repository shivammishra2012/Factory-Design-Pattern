package factoryDesignPattern;

public class Tester {
    public static void main(String []args)
    {
        Cofee cofee=new CofeeServer().serve("capsichnio");
        cofee.boil();
        cofee.brew();

    }
}
