public class Average {
    public static void main(String[] args) {
        // 实现一个方法 avg, 以数组为参数,
        // 求数组中所有元素的平均值(注意方法的返回值类型).
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(avg(arr));
    }

    public static double avg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
