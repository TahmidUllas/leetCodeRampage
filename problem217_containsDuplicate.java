import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem217_containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3,4, 4}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 6}));
        System.out.println(containsDuplicate(new int[]{1}));
        System.out.println(containsDuplicate(new int[]{}));
    }

}
