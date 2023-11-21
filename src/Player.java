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
        return switch (choice) {
            case 1 -> new Werewolf();
            case 2 -> new Vampire();
            case 3 -> new Mummy();
            default -> {
                System.out.println("Invalid choice");
                yield null;
            }
        };
    }

    public void displayMonsterDeck() {
        for (Monster monster : this.monsters) {
            System.out.println(monster.getName() + " | 💛:" + monster.getHealth() + "HP | 💢: " + monster.getAttackDamage() + " DMG");
        }
    }
}
