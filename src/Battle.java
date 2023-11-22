import java.util.Random;

public class Battle {
    private boolean gameOn = true;
    private Monster defendingMonster;


    public Battle(Player playerOne, Player playerTwo) {
        int size = playerOne.createDeck();
        playerTwo.createDeck2(size);

    }

    public void round(Player attackingPlayer, Player defendingPlayer) {
        Monster attackingMonster;
        int attackingIndex = (int) (Math.random() * attackingPlayer.getDeckMonsters().size() - 1);
        int defendingIndex = (int) (Math.random() * defendingPlayer.getDeckMonsters().size() - 1);

        if (attackingPlayer.getDeckMonsters().isEmpty() || defendingPlayer.getDeckMonsters().isEmpty()) {
            System.out.println("Alguem se fodeu");
        }else{
            attackingMonster = attackingPlayer.getDeckMonsters().get(attackingIndex);
            defendingMonster = defendingPlayer.getDeckMonsters().get(defendingIndex);
            attackingMonster.attack(defendingMonster);
        }
    }

    public void init(Player playerOne, Player playerTwo) {
        Player attackingPlayer;
        Player defendingPlayer;
        while (gameOn) {
            attackingPlayer = playerOne;
            defendingPlayer = playerTwo;
            round(playerOne, playerTwo);
            if (!defendingMonster.isMonsterAlive()) {
                System.out.println("'s " + defendingMonster.getName() + " has been defeated!");
                defendingPlayer.getDeckMonsters().remove(defendingMonster);
            }
            if(playerOne.getDeckMonsters().isEmpty() || playerTwo.getDeckMonsters().isEmpty()){
                gameOn=false;
            attackingPlayer = playerTwo;
            defendingPlayer = playerOne;
            round(playerTwo, playerOne);
            }
        }
    }

}




