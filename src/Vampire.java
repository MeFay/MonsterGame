public class Vampire extends Monster {
    public Vampire() {
        super("Vampire", 30, 5);
    }


    @Override
    public void attack(Monster defendingMonster) {
        int biteChance = (int) (Math.random() * 10) + 1;
        if (biteChance >= 5) {
            bite();
        } else {
            super.attack(defendingMonster);
        }
    }

    public void bite() {
        System.out.println("mordi");
        this.setHealth(this.getHealth() + 5);
    }
}
