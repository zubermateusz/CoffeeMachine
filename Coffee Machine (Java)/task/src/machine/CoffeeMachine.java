package machine;

import java.util.Scanner;

public class CoffeeMachine {


    public static void main(String[] args) {

        MachineState machineState = new MachineState(400, 540, 120, 550, 9);

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
