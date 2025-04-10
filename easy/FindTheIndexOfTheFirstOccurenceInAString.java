package easy;

public class FindTheIndexOfTheFirstOccurenceInAString {
    public static int strStr(String haystack, String needle) {
        // Se a needle estiver vazia, retorna 0
        if (needle.isEmpty()) return 0;

        // Se a needle estiver presente no haystack, retorna o índice da primeira ocorrência
        int index = haystack.indexOf(needle);

        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ello"));
    }
}