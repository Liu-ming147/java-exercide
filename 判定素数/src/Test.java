import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入要判断的数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for (i = 2; i <= num; i++) {
            if (num / i == 0) {
                break;
            }
        }
        if (i > num) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }
}
