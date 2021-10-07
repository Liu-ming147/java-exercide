import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //青蛙跳台阶问题（斐波拉切数列问题）
        System.out.println("请输入要跳的台阶数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fib(n));
    }

    public static int Fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
}
