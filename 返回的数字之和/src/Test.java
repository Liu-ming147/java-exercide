import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(numSum(n));
    }

    public static int numSum(int n) {
        int sum = 0;
        if (n < 10) {
            return n;
        }
        sum += n % 10 + numSum(n / 10);
        return sum;
    }
}
