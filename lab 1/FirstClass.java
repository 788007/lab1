
/**
 * Write a description of class FirstClass here.
 * 
 * @Laurel Woods
 * @version (a version number or a date)
 */
public class FirstClass
{
    // instance variables - replace the example below with your own
    private int a;
    private int b;

    /**
     * Constructor for objects of class FirstClass
     */
    public FirstClass()
    {
        // initialise instance variables
        a = 2;
        b = 5;
    }

    public FirstClass(int x, int y)
    {
        // put your code here
        a = x;
        b = y;
    }
    
    public int addEmUp(){
        return a + b;
    }
    public int difference(){
        return a - b;
    }
}
