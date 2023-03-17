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
        if(maxOfCoffee < quantityOfCups) {
            System.out.println("No, I can make only " + maxOfCoffee + " cup(s) of coffee");
        }
        if(maxOfCoffee == quantityOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if(maxOfCoffee > quantityOfCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxOfCoffee - quantityOfCups) + " more than that)");
        }
        //
         */

        //Stage 4/6: Buy, fill, take!
        MachineState machineState = new MachineState(400, 540, 120, 550, 9);

        System.out.println(machineState.printState());

        System.out.println("Write action (buy, fill, take): ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "buy":{
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                switch (scanner.nextInt()) {
                    case 1: machineState.buyEspresso(); break;
                    case 2: machineState.buyLatte(); break;
                    case 3: machineState.buyCappuccino();
                }
                break;
            }
            case "fill":{
                System.out.println("Write how many ml of water you want to add: ");
                int water = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                int milk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int coffeeBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add: ");
                int cups = scanner.nextInt();
                machineState.fill(water, milk, coffeeBeans, cups);
                break;
            }
            case "take":{
                System.out.println("I gave you $" + machineState.takeMoney());
            }
        }

        System.out.println(machineState.printState());

    }

    static int countCups(int water, int milk, int coffeeBeans){
        int waterForCup = 200;
        int milkForCup = 50;
        int coffeeBeansForCup = 15;
        return Math.min(water/waterForCup, Math.min(milk/milkForCup, coffeeBeans/coffeeBeansForCup));
    }// return max of cup of coffee
}
