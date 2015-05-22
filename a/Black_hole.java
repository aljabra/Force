package a;


/**
 * Write a description of class Black_hole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Black_hole
{
    // instance variables - replace the example below with your own
    private double x;
    final private double q;
    final private double k = 9;
    final private double t;
    private double a = 0, v = 0;
    /**
     * Constructor for objects of class Black_hole
     */
    public Black_hole(double constant, double intialDistance, double productCharges)
    {
        x = intialDistance;
        q = productCharges;
        t = constant;
    }
    public void change()
    {
        a = Math.pow(1/x,2);
        v = a*t + v;
        x = x + v*t + 1/2*a*t*t;
    }
    public double getAcceleration()
    {
        return a;
    }
    public double getVelocity()
    {
        return v;
    }
    public double getDisplacement()
    {
        return x;
    }
}
