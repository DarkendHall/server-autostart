## Server Autostart

Requirements:

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
7. Run the following command <code>docker-compose up --force-recreate --build -d</code>
8. ???
9. Success! A message should pop up in the discord channel whose ID you provided in the .env file with the IP-address
   to the server so people can join.
