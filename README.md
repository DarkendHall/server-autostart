## Server Autostart

This project is a discord bot combined with an automatically restarting minecraft server.

The Discord bot will once per "session" send a message to a channel of your choosing with the IP-address of the server.
If the server for any reason crashes, it should automatically restart immediately.

The discord bot doesn't need to be configured for the auto-restart to work, but could be useful if you don't
have a static IP-address to automatically notify people of the new IP-address.

Requirements:

* Docker & docker-compose (usually installed together)
* Java (only tested with 17)
* Minecraft server .jar file (named server.jar)
* Discord bot token (used for the notifier)
* Discord Channel ID (used for the notifier)

Instructions:

1. Update the <code>.env</code> file with your token and channel id for discord
2. Create a new folder in your home directory (<code>~</code>) called <code>mc-server</code>
3. Place the server.jar in<code>~/mc-server</code>
4. Run it once with the following command <code>java -jar ~/mc-server/server.jar</code>
5. Change the value <code>false</code> to <code>true</code> in <code>~/mc-server/eula.txt</code>
6. Make any changes to the <code>server.properties</code> file you desire
7. Run the following command <code>docker-compose up --force-recreate --build -d</code> where the docker-compose.yml
   file is located
8. ???
9. Success! A message should pop up in the discord channel whose ID you provided in the .env file with the IP-address
   to the server so people can join.
