package io.nxoscloud.aircoordinations.economy;

public class Business {
    private String name;
    private int profit;

    public Business(String name, int initialProfit) {
        this.name = name;
        this.profit = initialProfit;
    }

    public void simulateDay() {
        // Simulate daily business activities and profit/loss
        profit += (int)(Math.random() * 1000);
    }

    public int getProfit() {
        return profit;
    }

    public String getName() {
        return name;
    }
}
