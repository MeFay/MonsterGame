import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
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

    public int createDeck() {
        Scanner deckScanner = new Scanner(System.in);
        System.out.println(name + " can begin creating the deck!");
        System.out.println("Enter the numbers of creatures in your deck: ");
        int deckSize = deckScanner.nextInt();
        for (int i = 0; i < deckSize; i++) {
            System.out.println("\n1-Werewolf 🐺 \n2-Vampire 🧛🏻‍♀️\n3-Mummy 🧟");
            int choice = deckScanner.nextInt();
            switch (choice) {
                case 1 -> deckMonsters.add(new Werewolf());
                case 2 -> deckMonsters.add(new Vampire());
                case 3 -> deckMonsters.add(new Mummy());
            }
        }
        System.out.println(this.name + " has finished creating their deck.\n\n");
        return deckSize;
    }

    public void createDeck2(int deckSize) {
        System.out.println(name + " can begin creating the deck!");
        Scanner deckScanner = new Scanner(System.in);
        for (int i = 0; i < deckSize; i++) {
            System.out.println("\n1-Werewolf 🐺 \n2-Vampire 🧛🏻‍♀️\n3-Mummy 🧟");
            int choice = deckScanner.nextInt();
            switch (choice) {
                case 1 -> deckMonsters.add(new Werewolf());
                case 2 -> deckMonsters.add(new Vampire());
                case 3 -> deckMonsters.add(new Mummy());
            }
        }
        System.out.println(this.name + " has finished creating their deck.\n\n");
    }
}
