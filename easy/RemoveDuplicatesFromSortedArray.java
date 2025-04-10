package easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Contador para os elementos distintos
        // Loop sobre o array, começando do segundo elemento
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Coloca o número distinto na posição k
                k++; // Incrementa o contador de elementos distintos
            }
        }
        return k; // Retorna o número de elementos distintos
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 3, 4}));
    }
}