import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player{
    private String name;
    private List<Monster> deckMonsters;

    public Player(String name) {
        this.name = name;
        this.deckMonsters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Monster> getDeckMonsters() {
        return deckMonsters;
    }

    public void setDeckMonsters(List<Monster> deckMonsters) {
        this.deckMonsters = deckMonsters;
    }

    public void createDeck(int choice) {
        Scanner deckScanner = new Scanner(System.in);
        System.out.println("Enter the numbers of creatures in your deck: ");
        int deckSize = deckScanner.nextInt();
        for (int i = 0; i <= deckSize; i++) {
            switch (choice) {
                case 1 -> deckMonsters.add(new Werewolf());
                case 2 -> deckMonsters.add(new Vampire());
                case 3 -> deckMonsters.add(new Mummy());
            }
            ;
        }
    }
}
