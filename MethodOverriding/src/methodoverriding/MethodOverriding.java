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
          super.show();
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

public class MethodOverriding
{
    public static void main( String[] args)
    {
       B b = new B();
       b.show();
       
    }
}
