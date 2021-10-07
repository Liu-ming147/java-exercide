public class Test {
    public static void main(String[] args) {
        int a1, b1;
        a1 = 2;
        b1 = 3;
        double a2, b2, c2;
        a2 = 1.5;
        b2 = 2.5;
        c2 = 3.5;
        int ret1 = Add(a1, b1);
        double ret2 = Add(a2, b2, c2);
        System.out.println("ret1 = " + ret1);
        System.out.println("ret2 = " + ret2);
    }

    public static int Add(int a, int b) {
        return a + b;
    }

    public static double Add(double a, double b, double c) {
        return a + b + c;
    }
}
