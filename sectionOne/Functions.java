public class Functions {
    static double width = 20;
    static double height = 10;

    public static void main(String[] args) {
        if (calculateArea(width, height)) {
            construaCasa();
        } else {
            System.out.println("Não cabe");
        }
    }

    public static boolean calculateArea(double width, double height) {
        double area = width * height;
        if (area < 1500) {
            return false;
        } else {
            return true;
        }
    }

    public static void construaCasa() {
        System.out.println("Construir");
    }
}
