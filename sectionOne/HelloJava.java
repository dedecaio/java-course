import java.util.Scanner;
import java.util.Locale;

public class HelloJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
         * double a, b, c;
         * a = sc.nextDouble();
         * b = sc.nextDouble();
         * c = (double) a * b;
         * sc.nextLine();
         * 
         * if (c > 12) {
         * System.out.println("É maior que 12");
         * } else if (c == 8) {
         * System.out.println("EITA, é 8");
         * } else {
         * System.out.println("Não é maior");
         * }
         * 
         * System.out.println(a > b);
         */

        String senhaAtual, senhaDigitada;
        senhaAtual = "susuejade6923";
        System.out.println("DIGITE SUA SENHA PARA PROSSEGUIR :)");
        senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaAtual) || senhaDigitada.equals("Susuejade6923")) {
            System.out.println("Pode prosseguir...");
        } else {
            System.out.println("Senha incorreta");
        }

        sc.close();

        // Comparar 2 variáveis
        // compare ==
        // diferent !=
        // more or equal >=
        // less or equal <=
        // more >
        // less <

        // para STRINGS
        // usa-se equals ou !equals COMO FUNÇÃO

        // operators
        // && - E
        // || - ou
        // ! - negado
        // As comparações podem ser feitas em uma linha só
        int a, b;
        a = 3;
        b = 4;
        boolean equals = !(a >= b);
        System.out.println(equals);
    }
}
