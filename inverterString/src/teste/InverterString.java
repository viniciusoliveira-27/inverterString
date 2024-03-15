package teste;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();

        String invertida = inverterString(entrada);
        System.out.println("String invertida: " + invertida);
        
        sc.close();
    }

    public static String inverterString(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
