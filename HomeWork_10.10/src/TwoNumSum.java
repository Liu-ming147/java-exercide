import java.util.Arrays;

public class TwoNumSum {
    public static void main(String[] args) {
        //给定一个整数数组 arr 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
        //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
        //你可以按任意顺序返回答案。
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoNumSum(arr, target)));
    }

    public static int[] twoNumSum(int[] arr, int target) {
        int[] index = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] + arr[j] == target) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}
