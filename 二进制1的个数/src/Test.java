import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        System.out.println("1的个数为:" + count);
    }
}
