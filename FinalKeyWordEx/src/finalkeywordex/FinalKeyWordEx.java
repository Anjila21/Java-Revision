class FinalKeyWordEx {

    final static float PI = 3.1415f;

    public static void main(String[] args) {
        int r = 5; 
        area(r);
    }

    static void area(int r) {
        float a = PI * r * r;
        System.out.println("Area: " + a);
    }
}
