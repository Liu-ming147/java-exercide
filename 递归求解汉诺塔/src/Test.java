import java.util.Scanner;

public class Test {
    static int count = 1;
    public static void main(String[] args) {
        System.out.println("请输入汉诺塔层数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("移动步骤：");
        hanoi(n, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char A, char B, char C) {
        if (n == 1) {
            move(A, C);
        }else {
            hanoi(n - 1, A, C, B);
            move(A, C);
            hanoi(n - 1, B, A, C);
        }
    }

    public static void move(char A, char C) {
        System.out.println("第" + count++ + "步：" + A + "-->" + C);
    }
}
