import java.util.Scanner;
import java.util.Locale;

public class HelloJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = (double) a * b;

        System.out.println(c);
        sc.close();

    }
}
