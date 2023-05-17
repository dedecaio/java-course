import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números");
        double a, b, c;
        a = sc.nextDouble();
        sc.nextLine();
        b = sc.nextDouble();
        sc.nextLine();
        c = sc.nextDouble();
        sc.nextLine();

        System.out.println(sumNumbers(a, b, c));

        sc.close();
    }

    public static double sumNumbers(double a, double b, double c) {
        double sum = a + b + c;
        return sum;
    }
}
