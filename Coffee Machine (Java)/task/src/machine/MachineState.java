package machine;

public class MachineState {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int money;
    private int cups;

    public MachineState(int water, int milk, int coffeeBeans, int money, int cups){
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
        this.cups = cups;
    }

    public int takeMoney(){
        int tempMoney = this.money;
        this.money = 0;
        return tempMoney;
    }

    public void fill(int water, int milk, int coffeeBeans, int cups){
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
        this.cups += cups;
    }

    public void buyEspresso(){
        this.water -= 250;
        this.coffeeBeans -= 16;
        this.money += 4;
        this.cups--;
    }

    public void buyLatte(){
        this.water -= 350;
        this.milk -= 75;
        this.coffeeBeans -= 20;
        this.money += 7;
        this.cups--;
    }

    public void buyCappuccino(){
        this.water -= 200;
        this.milk -= 100;
        this.coffeeBeans -= 12;
        this.money += 6;
        this.cups--;
    }


    public String printState(){
        return "The coffee machine has:\n" +
                this.water + " ml of water\n" +
                this.milk + " ml of milk\n" +
                this.coffeeBeans + " g of coffee beans\n" +
                this.cups + " disposable cups\n" +
                "$" + this.money + " of money";
    }

}
