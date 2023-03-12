package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        // Stage 1/6: Making coffee
        /*
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
        */

        Scanner scanner = new Scanner(System.in);
        int numbersOfCoffee = scanner.nextInt();

        System.out.println("For "+ numbersOfCoffee +" cups of coffee you will need:\n" +
                numbersOfCoffee * 200 +" ml of water\n" +
                numbersOfCoffee * 50 +" ml of milk\n" +
                numbersOfCoffee * 15+" g of coffee beans");
    }
}
