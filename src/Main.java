import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Aesthetic.displayIntro();
        Scanner playerNameScanner = new Scanner(System.in);

        System.out.println("\n\n\n First Player, enter your name here");
        String playerOneName = playerNameScanner.next();
        System.out.println("Let us start " + playerOneName);
        Player playerOne = new Player(playerOneName);

        System.out.println("\nSecond Player, enter your name here");
        String playerTwoName = playerNameScanner.next();
        System.out.println("Let us start " + playerTwoName);
        Player playerTwo = new Player(playerTwoName);

        new Battle(playerOne, playerTwo).init(playerOne, playerTwo);
    }
}