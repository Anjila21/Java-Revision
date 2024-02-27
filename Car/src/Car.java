public class Car
{
    String name;
    int speed;
    int mileage;
    
    public static void main(String[] args)
    {
        Car c = new Car();
        c.name="Honda";
        c.speed=200;
        c.mileage=10;
        System.out.println("Car Name:"+c.name);
    }
}