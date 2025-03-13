package Easy;

public class Main {
    public static String addStrings(String num1, String num2) {
        int indexNum1 = num1.length() - 1;
        int indexNum2 = num2.length() - 1;
        int aux = 0;

        String resultado = "";

        while (indexNum1 >= 0 || indexNum2 >= 0 || aux > 0) {
            int aux1 = (indexNum1 >= 0) ? num1.charAt(indexNum1) - '0' : 0;
            int aux2 = (indexNum2 >= 0) ? num2.charAt(indexNum2) - '0' : 0;

            int soma = aux1 + aux2 + aux;
            aux = soma / 10;

            // Concatena o novo dígito na frente da string
            resultado = (soma % 10) + resultado;

            indexNum1--;
            indexNum2--;
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11", "123")); // Saída esperada: "242"
    }
}
