package io.nxoscloud.aircoordinations.economy;

import java.util.Random;

public class EconomicEvents {

    private static final Random RANDOM = new Random();

    public static void triggerEvent() {
        int event = RANDOM.nextInt(3);
        switch (event) {
            case 0:
                // Market crash
                System.out.println("Economic crash! Market values are plummeting.");
                // Implement logic to reduce city revenue
                break;
            case 1:
                // Economic boom
                System.out.println("Economic boom! Market values are soaring.");
                // Implement logic to increase city revenue
                break;
            case 2:
                // Neutral event
                System.out.println("Economic event: No significant changes.");
                break;
        }
    }
}
