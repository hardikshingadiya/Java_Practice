// Program: Demonstration of this Keyword

public class ThisKeyword
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.display();
    }
}
class Demo {
    int num;

    // Constructor
    Demo() {
        this(10);          // Calls another constructor
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    Demo(int num) {
        this.num = num;    // Refers to current class variable
    }

    void show() {
        System.out.println("Number = " + num);
    }

    void display() {
        this.show();       // Calls current class method
    }
}