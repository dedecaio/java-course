import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE SUA NOVA SENHA");

        String senha = sc.nextLine();

        int tamanhoSenha = senha.length();

        if (tamanhoSenha >= 8) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha precisa ser maior");
        }

        sc.close();
    }
}