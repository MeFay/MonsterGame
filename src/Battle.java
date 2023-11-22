import java.util.Random;

public class Battle {
    private boolean gameOn = true;

    private static int decksize = 3;
    private Player playerOne = new Player("joao");
    private Player playerTwo = new Player("LEO");
    private Monster attackingMonster;
    private Player defendingPlayer;
    private Monster defendingMonster;


    public Battle() {
        playerOne.createDeck(decksize);
        playerTwo.createDeck(decksize);
    }

    public void round(Player attackingPlayer, Player defendingPlayer) {
        int attackingIndex = (int) Math.round(Math.random() * 3);
        int defendingIndex = (int) Math.round(Math.random() * 3);
        attackingMonster = attackingPlayer.getDeckMonsters().get(attackingIndex);
        defendingMonster = defendingPlayer.getDeckMonsters().get(defendingIndex);
        attackingMonster.attack(defendingMonster);
    }

    public void init() {
        while (!playerOne.getDeckMonsters().isEmpty() && !playerTwo.getDeckMonsters().isEmpty()){
            round(playerOne, playerTwo);
            if (!defendingMonster.isMonsterAlive()) {
                System.out.println(defendingPlayer.getName() + "'s " + defendingMonster.getName() + " has been defeated!");
                defendingPlayer.getDeckMonsters().remove(defendingMonster);
            }
            round(playerTwo, playerOne);
        }
    }

}




