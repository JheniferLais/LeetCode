package easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        // Remove espaços em branco no início e no final da string
        s = s.trim();

        // Divide a string em palavras usando o espaço como delimitador
        String[] words = s.split(" ");

        // Retorna o comprimento da última palavra
        return words[words.length - 1].length();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}