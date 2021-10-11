public class OnceNumber {
    public static void main(String[] args) {
        // 给定一个非空整数数组，除了某个元素只出现一次以外，
        // 其余每个元素均出现两次。找出那个只出现了一次的元素。
        int[] arr = new int[]{4, 1, 2, 1, 2};
        System.out.println(onceNumber(arr));
    }

    public static int onceNumber(int[] arr) {
        int ret = 0;
        for (int i : arr) {
            ret ^= i;
        }
        return ret;
    }
}
