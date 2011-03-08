package de.tdng2011.game.sampleclient.java;

import de.tdng2011.game.library.World;
import de.tdng2011.game.library.ScoreBoard;
import de.tdng2011.game.library.connection.AbstractClient;
import de.tdng2011.game.library.connection.RelationTypes;
import scala.collection.JavaConversions;
import scala.collection.immutable.List;
import scala.collection.mutable.Buffer;

import java.io.IOException;
import java.util.Arrays;

public class Client extends AbstractClient {

    private static Client client;

    public Client(final String hostname) {
        super(hostname, RelationTypes.Player(), true);
    }

    public static void main(String... args) throws IOException {
        System.out.println("Sample java client");

        client = new Client("test.scubywars.de");

        client.action(true, false, true, true);
    }

    public String name() {
        return "Java-Client";
    }

    public void processWorld(World world) {
        // TODO
    }

    //public static Buffer asScalaBuffer(Object... objects) {
    //    return JavaConversions.asScalaBuffer(Arrays.asList(objects));
    //}
}
