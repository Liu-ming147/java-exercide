import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        while (true) {
            System.out.println("请输入猜测的数：");
            int num = sc.nextInt();
            if (num > toGuess) {
                System.out.println("大了");
            } else if (num < toGuess) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你猜对了！");
                break;
            }
        }
        sc.close();
    }
}
