import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Player playerOne = new Player("joao");
    private static Player playerTwo = new Player("LEO");
    private static int decksize = 3;

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.init();

    }
}