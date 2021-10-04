public class Test {
    public static void main(String[] args) {
        int j;
        for (int i = 1; i < 101; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.println(i);
            }
        }
    }
}
