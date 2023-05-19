import util.Accounts;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        String name = sc.next();
        System.out.println("Is there an initial deposit (y/n)?");
        String a = sc.next();
        double deposit = 0;
        if(a.equals("y")){
            System.out.println("Enter a initial deposit value: ");
            deposit = sc.nextDouble();
        }else if(a.equals("n")){
            deposit = 0;
        }else{
            System.out.println("Parâmetro não compatível, apenas (y/n)");
        }


        Accounts account = new Accounts(number, name, deposit);

        System.out.println("\nAccount data: \n" + account);

        System.out.println("\nEnter a deposit value: ");
        deposit = sc.nextDouble();
        account.addDeposit(deposit);
        System.out.println("Updated account data: \n" + account);

        System.out.println("\nEnter a withdraw value: ");
        deposit = sc.nextDouble() + 5.00;
        account.withDraw(deposit);
        System.out.println("Updated account data: \n" + account);



        sc.close();

    }
}