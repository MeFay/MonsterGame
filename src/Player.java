import java.util.List;
import java.util.Scanner;

class Player extends Battle {
    private String name;
    private List<Monster> monsters;

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

    private Monster createDeck(int choice) {
        Scanner deckScanner = new Scanner(System.in);
        System.out.println("Enter the numbers of creatures in your deck: ");
        int deckSize = deckScanner.nextInt();
        for (int i = 0; i < deckSize; i++) {
            switch (choice) {
                case 1 -> new Werewolf();
                case 2 -> new Vampire();
                case 3 -> new Mummy();
            };
        }
        return null;
    }


    public void displayMonsterDeck() {
        for (Monster monster : this.monsters) {
            System.out.println(monster.getName() + " | 💛: " + monster.getHealth() + "HP | 💢: " + monster.getAttackDamage() + " DMG");
        }
    }


}
