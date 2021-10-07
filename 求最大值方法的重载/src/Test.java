public class Test {
    public static void main(String[] args) {
        int a1, b1;
        a1 = 2;
        b1 = 3;
        double a2, b2;
        a2 = 1.5;
        b2 = 2.5;
        System.out.println(Max(a1, b1));
        System.out.println(Max(a2, b2));
        System.out.println(Max(a1, b1, b2));
    }

    public static int Max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static double Max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static double Max(int a, double b, double c) {
        if ((double)a > b) {
            if ((double)a > c) {
                return (double)a;
            }
            return b;
        }
        return c;
    }
}
