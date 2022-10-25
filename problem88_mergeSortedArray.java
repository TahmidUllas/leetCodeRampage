import java.util.Arrays;

public class problem88_mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cnt1 = m - 1;
        int cnt2 = n - 1;
        for (int i = m + n - 1; cnt2 >= 0; i--) {
            nums1[i] = cnt1 >= 0 && nums1[cnt1] >= nums2[cnt2]
                    ? nums1[cnt1--]
                    : nums2[cnt2--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

}
