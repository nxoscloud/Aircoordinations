package io.nxoscloud.aircoordinations.transport;

import java.util.Timer;
import java.util.TimerTask;

public class TrainScheduler {

    private static final Timer TIMER = new Timer();

    public static void scheduleTrain(int delayInSeconds) {
        TIMER.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Train is arriving at the station.");
                // Implement train arrival logic
            }
        }, delayInSeconds * 1000);
    }
}
