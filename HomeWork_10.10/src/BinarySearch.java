public class BinarySearch {
    public static void main(String[] args) {
        //给定一个有序整型数组, 实现二分查找
        int[] arr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }
        System.out.println(binarySearch(arr, 999));
    }
    
    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (toFind > arr[mid]) {
                left = mid + 1;
            } else if (toFind < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
