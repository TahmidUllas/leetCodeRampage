import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class problem1_twoSum {
    /*public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                indices = new int[]{m.get(target - nums[i]), i};
                break;
            } else {
                m.put(nums[i], i);
            }
        }
        return indices;
    }*/

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    indices = new int[]{i, j};
                    break;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{5, 4, -1, 7, 8}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{-2, 1}, -1)));
        /*System.out.println(maxSubArray(new int[]{}));
        System.out.println(maxSubArray(new int[]{}));*/
    }

}
