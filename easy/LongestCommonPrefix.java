package easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String commonPrefix = ""; // Prefixo comum
        for (int i = 0; i < strs[0].length(); i++) {
            char currentWord = strs[0].charAt(i); // Caractere da primeira string na posição i

            // Verifica se o caractere da posição i é o mesmo para todas as strings
            for (String word : strs) {
                if (i >= word.length() || word.charAt(i) != currentWord) {
                    return commonPrefix; // Retorna o prefixo comum até agora
                }
            }
            commonPrefix += currentWord; // Adiciona o caractere ao prefixo comum
        }

        return commonPrefix; // Retorna o prefixo comum
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}