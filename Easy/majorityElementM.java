package Easy;

import java.util.HashMap;
import java.util.Map;

public class majorityElementM {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maiorValor = Integer.MIN_VALUE;
        int maiorChave = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maiorValor) {
                maiorValor = entry.getValue();
                maiorChave = entry.getKey();
            }
        }
        return maiorChave;
    }

    public static void main(String[] args){
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
