    package desene_abstract;
    
    public class Cerc extends Punct
    {
        // instance variables
        int r;
    
    /**
    * Constructor for objects of class Cerc
    */
    public Cerc(int r, int x, int y)
    {
        // initialise instance variables
        super(x, y);
        this.r = r;
    }
    
    public double arie()
    {
        return Math.PI * r * r;
    }
    
    public int perim()
    {
        return (int)(2 * Math.PI * r);
    }
    
    public void desenez()
    {
        // se deseneaza cercul
    }
    
}
