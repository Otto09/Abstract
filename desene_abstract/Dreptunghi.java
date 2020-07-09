package desene_abstract;

public class Dreptunghi extends Punct
{
    // instance variables
    int a;
    int b;
    
    /**
     * Constructor for objects of class Dreptunghi
     */
    public Dreptunghi(int a, int b, int x, int y)
    {
        // initialise instance variables
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public double arie()
    {
        return a * b;
    }
    
    public int perim()
    {
        return 2 * (a + b);
    }
    
    public void desenez()
    {
        // se deseneaza dreptunghiul
    }
    
}
