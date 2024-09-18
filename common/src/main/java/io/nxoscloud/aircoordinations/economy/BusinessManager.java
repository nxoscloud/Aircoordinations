package io.nxoscloud.aircoordinations.economy;

import java.util.ArrayList;
import java.util.List;

public class BusinessManager {
    private List<Business> businesses = new ArrayList<>();

    public void addBusiness(Business business) {
        businesses.add(business);
    }

    public void simulateDay() {
        for (Business business : businesses) {
            business.simulateDay();
        }
    }

    public int getTotalProfit() {
        return businesses.stream().mapToInt(Business::getProfit).sum();
    }
}
