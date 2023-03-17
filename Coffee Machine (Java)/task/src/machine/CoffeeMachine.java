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
        //Stage 2/6: Ingredient calculator
        /*
        Scanner scanner = new Scanner(System.in);
        int numbersOfCoffee = scanner.nextInt();

        System.out.println("For "+ numbersOfCoffee +" cups of coffee you will need:\n" +
                numbersOfCoffee * 200 +" ml of water\n" +
                numbersOfCoffee * 50 +" ml of milk\n" +
                numbersOfCoffee * 15+" g of coffee beans");

         */
        //Stage 3/6: Estimate the number of servings
        /*System.out.println("Write how many ml of water the coffee machine has:");
        Scanner scanner = new Scanner(System.in);
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int quantityOfCups = scanner.nextInt();
        int maxOfCoffee = countCups(water, milk, coffeeBeans);

        //
         */

        //Stage 4/6: Buy, fill, take!
        MachineState machineState = new MachineState(400, 540, 120, 550, 9);

        //System.out.println(machineState.printState());
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");

            switch (scanner.nextLine()) {
                case "buy" -> {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    switch (scanner.nextLine()) {
                        case "1" -> machineState.buyEspresso();
                        case "2" -> machineState.buyLatte();
                        case "3" -> machineState.buyCappuccino();
                        case "back" -> { break; }
                    }
                }
                case "fill" -> {
                    System.out.println("Write how many ml of water you want to add: ");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    int cups = scanner.nextInt();
                    machineState.fill(water, milk, coffeeBeans, cups);
                }
                case "take" -> System.out.println("I gave you $" + machineState.takeMoney());
                case "remaining" -> System.out.println(machineState.printState());
                case "exit" -> System.exit(0);
            }
        }
    }


}
