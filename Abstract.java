import desene_abstract.*;

public class Abstract
{
    // instance variables
    private Punct p1, p2;

    /**
     * Constructor for objects of class Abstract
     */
    public Abstract()
    {
        // initialise instance variables
        p1 = new Dreptunghi(32, 24, 20, 30);
        p2 = new Cerc(124, 65, 75);
        System.out.println("Perim. dreptunghiului p1 este " + p1.perim() );
        System.out.println("Aria cercului p2 este " + p2.arie() );
    }
    
    public static void main(String s[])
    {
        Abstract d = new Abstract();
    }
    
}
