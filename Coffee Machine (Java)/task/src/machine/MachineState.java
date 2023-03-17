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
        if(isEnoughProducts(250, 16, 4)) {
            this.water -= 250;
            this.coffeeBeans -= 16;
            this.money += 4;
            this.cups--;
        }
    }

    public void buyLatte(){
        if(isEnoughProducts(350, 75, 20)) {
            this.water -= 350;
            this.milk -= 75;
            this.coffeeBeans -= 20;
            this.money += 7;
            this.cups--;
        }
    }

    public void buyCappuccino(){
        if(isEnoughProducts(200, 100, 12)) {
            this.water -= 200;
            this.milk -= 100;
            this.coffeeBeans -= 12;
            this.money += 6;
            this.cups--;
        }
    }


    public String printState(){
        return "The coffee machine has:\n" +
                this.water + " ml of water\n" +
                this.milk + " ml of milk\n" +
                this.coffeeBeans + " g of coffee beans\n" +
                this.cups + " disposable cups\n" +
                "$" + this.money + " of money";
    }

    public boolean isEnoughProducts(int water, int milk, int coffeeBeans){
        int maxCupsCanDo = Math.min(this.water/water, Math.min(this.milk/milk, Math.min(this.cups/1, this.coffeeBeans/coffeeBeans)));
        boolean flag = true;
        if(maxCupsCanDo < 1) {
            flag = false;
            System.out.println("No, I can make only " + maxCupsCanDo + " cup(s) of coffee");
        }
        if(maxCupsCanDo == 1) {
            System.out.println("I have enough resources, making you a coffee!");
        }
        return flag;

    }// return max of cup of coffee

}
