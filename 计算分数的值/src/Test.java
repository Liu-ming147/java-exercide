public class Test {
    public static void main(String[] args) {
        int flag = 1;
        double sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                flag = -flag;
            }
            sum += flag * (1.0 / i);
        }
        System.out.println(sum);
    }
}
