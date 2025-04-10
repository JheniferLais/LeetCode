package easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0; // Ponteiro para a posição onde vamos colocar o próximo valor válido

        // Loop sobre os elementos do array
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; // Move o valor válido para a posição i
                i++; // Incrementa o ponteiro para o próximo valor válido
            }
        }

        // O valor de i será o novo comprimento do array
        return i;
    }
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3));
    }
}