import java.util.Arrays;
import java.util.Locale;

public class MyJavaClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String[] names = { "Caio", "Jeane", "Ramon", "Alexsandro", "Juliana" };
        System.out.println(names[0]);

        double[][] grades = {
                { 5.5, 6.7, 8.0, 7.5 },
                { 8.0, 7.6, 8.5, 8.0 },
                { 5.5, 6.6, 8.0, 9.5 },
        };
        grades[1][2] = 6.9;
        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]));
    }
}