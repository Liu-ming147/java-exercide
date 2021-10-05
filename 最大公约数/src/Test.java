import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int n2 = sc.nextInt();
        while (n1 % n2 != 0) {
            int t = n1 % n2;
            n1 = n2;
            n2 = t;
        }
        System.out.println("最大公约数是:" + n2);
    }
}
