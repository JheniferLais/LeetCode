package easy;

public class CountingWordsWithAGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        // Itera sobre todas as palavras
        for (String word : words) {
            // Verifica se a palavra começa com o prefixo
            if (word.startsWith(pref)) {
                count++;
            }
        }

        // Retorna o número de palavras que começam com o prefixo
        return count;
    }
    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"banana", "apple", "blueberry"}, "na"));
    }
}