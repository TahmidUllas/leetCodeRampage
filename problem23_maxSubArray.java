import java.util.Arrays;

public class problem23_maxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int localMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localMax = localMax + nums[i] > nums[i]
                    ? localMax + nums[i]
                    : nums[i];
            if (max < localMax) {
                max = localMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println(maxSubArray(new int[]{-2, 1}));
        /*System.out.println(maxSubArray(new int[]{}));
        System.out.println(maxSubArray(new int[]{}));*/
    }

}
