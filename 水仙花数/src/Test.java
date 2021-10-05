public class Test {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int h = i / 100;
            int t = i % 100 / 10;
            int s = i % 10;
            if (h * h * h + t * t * t + s * s * s == i) {
                System.out.println(i);
            }
        }
    }
}
