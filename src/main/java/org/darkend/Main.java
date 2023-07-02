package org.darkend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        new Notifier(System.getenv("DISCORD_TOKEN"), System.getenv("DISCORD_CHANNEL_ID"), getIpAddress()).start().notifyStarted();
    }

    private static String getIpAddress() {
        String ipAddress = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://checkip.amazonaws.com").openStream()))) {
            ipAddress = bufferedReader.readLine();
        } catch (IOException ignored) {
        }
        return ipAddress;
    }
}
