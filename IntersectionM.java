import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionM {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> setNums2 = new HashSet<>();
        for (int num : nums2) {
            setNums2.add(num);
        }

        Set<Integer> intersecao = new HashSet<>();
        for (int num : nums1) {
            if (setNums2.contains(num)) {
                intersecao.add(num);
            }
        }
        return intersecao.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
