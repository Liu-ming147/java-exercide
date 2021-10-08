public class Test {
    public static void main(String[] args) {
        //递归求 1 + 2 + 3 + ... + 10
        System.out.println(sum(10));;
    }

    public static int sum(int n) {
        int sum = 0;
        if (n == 1) {
            return n;
        }
        sum += n + sum(n - 1);
        return sum;
    }
}
