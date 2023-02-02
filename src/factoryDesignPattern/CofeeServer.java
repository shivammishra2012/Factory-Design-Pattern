package factoryDesignPattern;

public class CofeeServer {

    public Cofee serve(String type)
    {
        Cofee cofee=new CoffeFactory().getCofee(type);
        return cofee;
    }
}
