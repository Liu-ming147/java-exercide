public class Test {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        System.out.println(Max2(a, b));
        System.out.println(Max3(a, b, c));
    }

    public static int Max2(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int Max3(int a, int b, int c) {
        if (Max2(a, b) > c) {
            return Max2(a, b);
        }
        return c;
    }
}
