public class ConstructorDemo
{
    public static void main(String args[])
    {
        ConstructorDemo c=new ConstructorDemo(5,9);
        c.show();
    }
    public ConstructorDemo()
    {
        System.out.println("This is Constructor");
        // default constructor
    }
    public ConstructorDemo(int a,int b)
    {
        a=5;
        b=6;
        System.out.println("This is Constructor with parameter"+ (a+b));
        a=0;
        b=1;
        System.out.println(a+b);
    }
    public void show()
    {
        System.out.println("Show Method - A Normal Method");
    }
}