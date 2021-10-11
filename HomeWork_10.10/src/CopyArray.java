import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        copyOf(arr1, arr);
        System.out.println(Arrays.toString(arr1));
    }

    public static void copyOf(int[] dist, int[] sour) {
        for (int i = 0; i < sour.length; i++) {
            dist[i] = sour[i];
        }
    }
}
