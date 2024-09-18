package io.nxoscloud.aircoordinations.economy;

public class EconomyManager {

    private int cityBudget;

    public EconomyManager(int initialBudget) {
        this.cityBudget = initialBudget;
    }

    public void spendFunds(int amount) {
        cityBudget -= amount;
    }

    public void receiveFunds(int amount) {
        cityBudget += amount;
    }

    public int getBudget() {
        return cityBudget;
    }
}
