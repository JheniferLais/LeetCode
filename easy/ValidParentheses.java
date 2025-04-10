package easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> pilha = new Stack<>(); // Pilha para armazenar os caracteres de abertura

        for (char caractere : s.toCharArray()) {
            // Verifica se o caractere é um dos de abertura
            if (caractere == '(' || caractere == '{' || caractere == '[') {
                pilha.push(caractere);
            }
            // Verifica se o caractere é um parêntese fechado e se ele corresponde ao de abertura
            else if (caractere == ')' && !pilha.isEmpty() && pilha.peek() == '(') {
                pilha.pop();
            }
            // Verifica se o caractere é uma chave fechada e se ela corresponde à chave de abertura
            else if (caractere == '}' && !pilha.isEmpty() && pilha.peek() == '{') {
                pilha.pop();
            }
            // Verifica se o caractere é um colchete fechado e se ele corresponde ao colchete de abertura
            else if (caractere == ']' && !pilha.isEmpty() && pilha.peek() == '[') {
                pilha.pop();
            }
            // Caso contrário, a expressão não está balanceada
            else {
                return false;
            }
        }

        // Se a pilha estiver vazia, os parênteses, chaves e colchetes estão balanceados
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}