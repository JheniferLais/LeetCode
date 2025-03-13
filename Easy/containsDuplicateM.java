package Easy;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicateM {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            boolean isPossible = set.add(nums[i]);

            if (!isPossible) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }
}