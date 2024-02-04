class A
{
    public void show()
    {
        System.out.println("This is Class A");
    }
}
class B extends A
{
    public void show()
    {
           System.out.println("This is Class B");
    }
}
class C extends B
{
    public void show()
    {
           System.out.println("This is Class C");
    }
}

public class Example
{
    public static void main( String[] args)
    {
       A a = new B();
       a.show();
       
    }
}
