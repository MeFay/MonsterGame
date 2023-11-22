public class Mummy extends Monster {

    int consecutiveAttack = 0;

    public Mummy() {
        super("Mummy 🧟‍", 50, 10);
    }

    @Override
    public void attack(Monster defendingMonster) {
        if (consecutiveAttack == 3) {
            System.out.println("I broke my own arm!");
            consecutiveAttack = 0;
        } else {
            super.attack(defendingMonster);
            consecutiveAttack++;
        }
    }
}
