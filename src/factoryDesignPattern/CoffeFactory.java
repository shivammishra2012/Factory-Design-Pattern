package factoryDesignPattern;

public class CoffeFactory {

    public Cofee getCofee(String type)
    {
        Cofee cofee;
        if(type.equals("capsichnio"))
        {
            cofee=new Capsichnio();
        }
       else {
            cofee = new Robusta();
        }
        return cofee;
    }
}
