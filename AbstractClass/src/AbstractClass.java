abstract class Person {

    public String name;
    public int age;
    public String address;

    public abstract void display();
    
    public void show()
    {
        
    }
}

class Student extends Person {

    @Override
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age:" + age);
        System.out.println("Student Address: " + address);
        System.out.println();

    }
}


class Faculty extends Person {

    @Override
    public void display() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty Age: " + age);
        System.out.println("Faculty Address: " + address);
        System.out.println(); 
    }
}

public class AbstractClass {

    public static void main(String[] args)
    {
        Student student = new Student();
        student.name="Anjila";
        student.age=22;
        student.address="kalanki";
        
        Faculty fact = new Faculty();
        fact.name="Maya";
        fact.age=40;
        fact.address="Amritnagar";
        
        student.display();
        fact.display();
                
    }
}
