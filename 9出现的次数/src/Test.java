public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++){
            int k = i;
            while (k != 0) {
                if (k % 10 == 9) {
                    count++;
                }
                k /= 10;
            }
        }
        System.out.println("9的个数是：" + count);
    }
}
