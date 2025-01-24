import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SHOPPING CART PROGRAM
        //for fucks sake i have spent 30 MINUTES TRYING TO FIGURE OUT WHY IT WASN'T WORKING AND I FORGOT TO PUT THE {} AFTER THE ARGS

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}