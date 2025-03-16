package Easy;

import java.util.*;


public class FindAllNumbersDisappearedInAnArrayM {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                disappearedNumbers.add(i);
            }
        }

        return disappearedNumbers;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
