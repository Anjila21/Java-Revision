
class StudentInfo {

    int id;
    String name;
    static String collegename = "XYZ";

    public StudentInfo(int i, String n) {
        id = i;
        name = n;
    }

    public void display() {
        System.out.println("Student Id: \t" + id);
        System.out.println("Student name" + name);
        System.out.println("Student College name" + collegename);
    }

    static public void changeCName() {
        collegename = "Padma Kanya Multiple Campus";
    }
}

public class StaticEx {

    public static void main(String[] args) {
        StudentInfo s= new StudentInfo(101,"Anjila");
      s.display();
      StudentInfo.changeCName();
      s.display();
      

    }
}
