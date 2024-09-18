package io.nxoscloud.aircoordinations.notifications;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class NotificationSystem {

    public static void sendNotification(String message) {
        MinecraftClient.getInstance().player.sendMessage(Text.of("Notification: " + message));
    }
}
