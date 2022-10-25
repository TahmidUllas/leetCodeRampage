import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem350_intersectionOfTwoArrays {
    int[] intersect(int[] nums1, int[] nums2) {
        int[] arrToSearch = nums1.length >= nums2.length ? nums2 : nums1;
        List<Integer> list1 = new ArrayList<>(Arrays.stream(nums1.length >= nums2.length ? nums1 : nums2).boxed().toList());
        List<Integer> newList = new ArrayList<>();
        for (int num : arrToSearch) {
            performAddToList(list1, newList, num);
        }
        return newList.stream().mapToInt(m -> m).toArray();
    }

    void performAddToList(List<Integer> list1, List<Integer> newList, int num) {
        if (list1.contains(num)) {
            list1.remove((Integer) num);
            newList.add(num);
        }
    }

    public static void main(String[] args) {
        Problem350_intersectionOfTwoArrays prob350 = new Problem350_intersectionOfTwoArrays();
        System.out.println(Arrays.toString(prob350.intersect(new int[]{1, 7, 3, 6, 5, 6}, new int[]{7, 3})));
    }
}
