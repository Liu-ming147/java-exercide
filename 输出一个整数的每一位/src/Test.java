import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
    public static void func(int n){
        if(n>9){
            func(n/10);
        }
        System.out.println(n % 10);
    }
}
