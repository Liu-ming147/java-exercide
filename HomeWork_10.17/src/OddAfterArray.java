import java.util.Arrays;

public class OddAfterArray {
    public static void main(String[] args) {
        //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        oddAfterArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void oddAfterArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 1 && left < right) {
                right--;
            }
            //交换奇数和偶数
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
