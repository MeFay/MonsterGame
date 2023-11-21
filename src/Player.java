import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player extends Battle {
    private String name;
    private List<Monster> monsters;
    private List<Monster> deckMonsters;

    public Player(String name, List<Monster> monsters) {
        this.name = name;
        this.monsters = monsters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public List<Monster> getDeckMonsters() {
        return deckMonsters;
    }

    public void setDeckMonsters(List<Monster> deckMonsters) {
        this.deckMonsters = deckMonsters;
    }

    private void createDeck(int choice) {

        Scanner deckScanner = new Scanner(System.in);
        System.out.println("Enter the numbers of creatures in your deck: ");
        int deckSize = deckScanner.nextInt();
        for (int i = 0; i < deckSize; i++) {
            switch (choice) {
                case 1 -> deckMonsters.add(new Werewolf());
                case 2 -> deckMonsters.add(new Vampire());
                case 3 -> deckMonsters.add(new Mummy());
            }
            ;
        }
    }
}
