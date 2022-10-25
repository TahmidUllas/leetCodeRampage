import java.util.Arrays;
import java.util.List;

public class Problem349_intersectionOfTwoArrays1 extends Problem350_intersectionOfTwoArrays {

    @Override
    void performAddToList(List<Integer> list1, List<Integer> newList, int num) {
        if (list1.contains(num) && !newList.contains(num)) {
            newList.add(num);
        }
    }

    public static void main(String[] args) {
        Problem350_intersectionOfTwoArrays prob349 = new Problem349_intersectionOfTwoArrays1();
        System.out.println(Arrays.toString(prob349.intersect(new int[]{1, 7, 3, 6, 5, 6}, new int[]{7, 3})));
    }
}
