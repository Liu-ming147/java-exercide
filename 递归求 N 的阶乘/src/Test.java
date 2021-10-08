import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入N：");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fact(N));
    }

    public static int fact(int n) {
        int sum = 1;
        if (n == 1) {
            return n;
        }
        sum *= n * fact(n - 1);
        return sum;
    }
}
