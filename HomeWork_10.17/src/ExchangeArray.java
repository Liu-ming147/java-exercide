import java.util.Arrays;

public class ExchangeArray {
    public static void main(String[] args) {
        //给定两个整型数组, 交换两个数组的内容.
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{6, 7, 8, 9, 10};
        exchangeArray(arr1, arr2);
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println("arr2:" + Arrays.toString(arr2));
    }

    public static void exchangeArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
}
