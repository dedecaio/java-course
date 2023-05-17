import java.util.Scanner;

public class SecondProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lets play Pokerito. Tpe anything when you're ready");
        sc.nextLine();
        System.out.println("It's like poker, but a lot simpler\n");
        System.out.println(" - There are two players, you and the computer.");
        System.out.println(" - The dealer will give each player one card.");
        System.out.println(" - Then, the dealer will draw five cards (the river)");
        System.out.println(" - The player with the most river matches wins!");
        System.out.println(" - If the matches are equal, everyone's a winner!\n");
        System.out.println(" - Ready? Type anything if you are.");
        sc.nextLine();

        String yourCard = randomCard();
        String computerCard = randomCard();

        System.out.println("Here is your card:\n" + yourCard + "\nHere is the computer card:\n" + computerCard);

        int yourMatches = 0;
        int computerMatches = 0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 0; i < 5; i++) {
            sc.nextLine();
            String draw = randomCard();
            System.out.println("Card " + (i + 1));
            System.out.println(draw);

            if (yourCard.equals(draw)) {
                yourMatches++;
            }
            if (computerCard.equals(draw)) {
                computerMatches++;
            }
        }
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("The computer number of matches: " + computerMatches);

        System.out.println("Press enter to see the results.");
        sc.nextLine();
        if (yourMatches > computerMatches) {
            System.out.println("Congratulations, you won!");
        } else if (computerMatches > yourMatches) {
            System.out.println("Oh, sorry, but you lose! Try again.");
        } else {
            System.out.println("You tied!");
        }

        sc.close();
    }

    /*
     * There are two players, you and the computer.
     * - The dealer will give each player one card.
     * - Then, the dealer will draw five cards (the river)
     * - The player with the most river matches wins!
     * - If the matches are equal, everyone's a winner!
     * - Ready? Type anything if you are.
     */
    public static String randomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        int ramdomInt = (int) randomNumber;

        switch (ramdomInt) {
            case 1:
                return "    _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "    _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "    _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
            case 4:
                return "    _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return "    _____\n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "    _____\n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____9|\n";
            case 7:
                return "    _____\n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____J|\n";
            case 8:
                return "    _____\n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "    _____\n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____6|\n";
            case 10:
                return "    _____\n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___01|\n";
            case 11:
                return "    _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "    _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%0|\n";
            case 13:
                return "    _____\n" +
                        "  |K  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
            default:
                return "Olá";
        }
    }
}
