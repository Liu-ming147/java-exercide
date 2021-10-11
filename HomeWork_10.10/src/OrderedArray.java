public class OrderedArray {
    public static void main(String[] args) {
        //给定一个整型数组, 判定数组是否有序（递增）
        int[] arr = new int[]{1, 5, 4, 8, 3, 2, 7, 9, 0, 6};
        System.out.println(isOrderedArray(arr));
    }

    public static boolean isOrderedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
