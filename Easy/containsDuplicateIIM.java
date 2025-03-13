package Easy;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicateIIM {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> intervalo = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (intervalo.contains(nums[i])) {
                return true;
            }

            intervalo.add(nums[i]);

            if (intervalo.size() > k) {
                intervalo.remove(nums[i - k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{99,99}, 2));
    }
}
