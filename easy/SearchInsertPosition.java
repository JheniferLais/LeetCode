package easy;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        // Percorre todos os elementos do array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i; // Retorna o índice onde o target deve ser inserido
            }
        }
        // Se não encontrar, retorna o comprimento do array (onde o target seria inserido no final)
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }
}