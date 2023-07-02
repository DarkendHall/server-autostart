package org.darkend;

import discord4j.common.util.Snowflake;
import discord4j.core.DiscordClient;
import discord4j.core.object.entity.channel.MessageChannel;

public class Notifier {
    private final String token;
    private final String ipAddress;
    private final String channelId;

    private DiscordClient discordClient;

    public Notifier(String token, String channelId, String ipAddress) {
        this.token = token;
        this.ipAddress = ipAddress;
        this.channelId = channelId;
    }

    public Notifier start() {
        discordClient = DiscordClient.create(token);
        return this;
    }

    public void notifyStarted() {
        if (discordClient == null) {
            System.out.println("Client is null");
            return;
        }
        discordClient.withGateway(client -> client.getChannelById(Snowflake.of(channelId)).ofType(MessageChannel.class).flatMap(messageChannel -> messageChannel.createMessage("Server restarted. \nNew IP: `" + ipAddress + ":25565`"))).block();
    }
}
