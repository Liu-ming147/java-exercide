import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //给定一个整型数组, 实现冒泡排序(升序排序)
        int[] arr = new int[]{1, 5, 4, 8, 3, 2, 7, 9, 0, 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
