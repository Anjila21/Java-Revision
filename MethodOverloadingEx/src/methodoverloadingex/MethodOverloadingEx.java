public class MethodOverloadingEx
{
  void multiply(int a, int b)
  {
    System.out.println("Result is"+(a*b)) ;
  }
  void multiply(int a, int b,int c)
  {
    System.out.println("Result is"+(a*b*c));
  }
  public static void main(String[] args)
  {
    MethodOverloadingEx obj = new MethodOverloadingEx();
    obj.multiply(8,5);   
    obj.multiply(4,6,2);   
  }
}