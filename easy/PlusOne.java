package easy;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Começa do final do array e incrementa o último dígito
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Se o dígito for menor que 9, incrementa e termina
                return digits;
            }
            digits[i] = 0; // Se for 9, se torna 0 e continua para o próximo dígito
        }

        // Se todos os dígitos eram 9, o array terá agora todos os valores como 0
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }
}