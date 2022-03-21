package machine;

public enum CoffeeSelect {
    ESPRESSO(250, 16, 0, 1, 4),
    LATTE(350, 20, 75, 1, 7),
    CAPPUCCINO(200, 12, 100, 1, 6);

    private final int water;
    private final int milk;
    private final int beans;
    private final int cups;
    private final int money;

    CoffeeSelect(int water, int beans, int milk, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }
}
