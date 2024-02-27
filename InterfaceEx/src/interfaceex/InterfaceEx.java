
interface Printable {

    void print();
}

interface Showable {

    void show();
}

class InterfaceEx implements Printable, Showable {

    public void print() {
        System.out.print("Print");
    }

    public void show() {
        System.out.print("Show");
    }

    public static void main(String[] args) {
        InterfaceEx i = new InterfaceEx();
        i.print();
        System.out.println();
        i.show();
    }
}