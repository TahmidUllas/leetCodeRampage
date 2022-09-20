public class problem724_pivotIndex {
    public static int pivotIndex(int[] nums) {
        int index = -1;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (getSum(sum, nums, 0, j) == getSum(sum, nums, j + 1, nums.length)) return j;
        }
        return index;
    }

    public static int getSum(int sum, int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
        System.out.println(pivotIndex(new int[]{2, 1, 2}));
        System.out.println(pivotIndex(new int[]{2, 1, 1, 1}));
        System.out.println(pivotIndex(new int[]{2, 1, 1, 3}));
    }
}
