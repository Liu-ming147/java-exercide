public class ThreeOdd {
    public static void main(String[] args) {
        // 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
        // 如果存在，请返回 true ；否则，返回 false.
        int[] arr = new int[]{1,2,34,3,4,5,7,23,12};
        System.out.println(threeOddArray(arr));
    }

    public static boolean threeOddArray(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] % 2 == 1 && arr[i - 1] % 2 == 1 && arr[i + 1] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
