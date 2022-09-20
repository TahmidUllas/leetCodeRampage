import java.util.Arrays;

public class problem1480_runningSum {
    public static int[] runningSum(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            if (j != 0) {
                nums[j] += nums[j - 1];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(runningSum(new int[]{3, 1, 2, 10, 1})));
    }

}
