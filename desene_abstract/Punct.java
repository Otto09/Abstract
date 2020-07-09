package desene_abstract; 

/**
 * Abstract class Punct
 */
public abstract class Punct
{
    // instance variables
    private int x;
    private int y;
    
    public Punct(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setY()
    {
        this.y = y;
    }
    
    public void translatez(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public abstract double arie();
    
    public abstract int perim();
    
    public abstract void desenez();
    
}
