public class Werewolf extends Monster{
    public Werewolf() {
        super("Werewolf 🐺", 40, 9 );
    }

    @Override
    public void attack(Monster defendingMonster) {
        super.attack(defendingMonster);
    }
}
