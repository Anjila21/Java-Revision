class Box 
{
    public double length;
    public double height;
    public double breadth;
    
    public Box()
    {
        length=0;
        height=0;
        breadth=0;
    }
    public Box(double length, double height , double breadth)
    {
        this.length= length;
        this.height= height;
        this.breadth= breadth;
    }
    
    public double areaBox()
    {
        return length*breadth;
    }
    
    public double volumeBox()
    {
        return length*breadth*height;
    }
}

public class JavaKeywordEx
{
    public static void main(String [] args)
    {
        Box b = new Box(10,10,10);  
        System.out.println(b.areaBox());
        System.out.println(b.volumeBox());
        }
    
}