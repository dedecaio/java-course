import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*--* JAVAPEDIA *--*");
        System.out.println("How many historical figures will you register?");

        int people = sc.nextInt();

        String[][] database = new String[people][3];

        sc.nextLine();
        for (int i = 0; i < database.length; i++) {
            System.out.print("\t - Name: ");
            database[i][0] = sc.nextLine();
            System.out.print("\t - Date of birth:");
            database[i][1] = sc.nextLine();
            System.out.print("\t - OOccupation: ");
            database[i][2] = sc.nextLine();
            System.out.print("\n ");
        }

        System.out.println("Saca só essa parada irmão, tudo os mano adiconado:");
        print2DArray(database);

        System.out.println("Who do you want information on? ");
        String name = sc.nextLine();
        System.out.print("\n");
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\t - Name: " + database[i][0]);
                System.out.println("\t - Date of birth: " + database[i][1]);
                System.out.println("\t - OOccupation: " + database[i][2]);
            }
        }

        sc.close();
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
