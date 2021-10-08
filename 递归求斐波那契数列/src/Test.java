import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入项数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}