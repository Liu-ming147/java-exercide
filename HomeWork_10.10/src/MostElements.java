import java.util.Arrays;

public class MostElements {
    public static void main(String[] args) {
        //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        //你可以假设数组是非空的，并且给定的数组总是存在多数元素。
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(mostElements(arr));
    }

    public static int mostElements(int[] arr) {
            Arrays.sort(arr);
            return arr[arr.length/2];
    }
}
