public class Werewolf extends Monster{
    public Werewolf() {
        super("Werewolf", 40, 15 );
    }

    @Override
    public void attack(Monster defendingMonster) {
        super.attack(defendingMonster);
    }
}
