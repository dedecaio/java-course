import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual teu clima bixo?");
        String weather = sc.nextLine();
        switch (weather) {
            case "rainy":
                System.out.println("Ta chovendo");
                break;
            case "snowy":
                System.out.println("Ta nevando");
                break;
            case "sunny":
                System.out.println("Ta sol");
                break;
            case "nublano":
                System.out.println("Ta nublano");
                break;
            default:
                System.out.println("MEU USA CLIMA VÁLIDO");
        }
        sc.close();
    }

}
