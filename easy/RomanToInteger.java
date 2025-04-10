package easy;

import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Mapa direto com os valores dos números romanos
        Map<Character, Integer> romano = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int total = 0;
        int previous = 0;

        // Loop pela string de trás para frente
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romano.get(s.charAt(i));

            if (current < previous) {
                total -= current; // Subtrai se o valor atual for menor que o anterior
            } else {
                total += current; // Soma caso contrário
            }
            previous = current; // Atualiza o valor anterior
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }
}