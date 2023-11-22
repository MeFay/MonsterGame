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
            System.out.println("\nThe winner as arisen and the loser has fallen");
        }else{
            attackingMonster = attackingPlayer.getDeckMonsters().get(attackingIndex);
            defendingMonster = defendingPlayer.getDeckMonsters().get(defendingIndex);
            attackingMonster.attack(defendingMonster);
        }
    }

    public void init(Player playerOne, Player playerTwo) {

        while (gameOn) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }


            if (playerOne.getDeckMonsters().isEmpty() || playerTwo.getDeckMonsters().isEmpty()) {
                gameOn=false;
            }else{
                round(playerOne, playerTwo);
                if (!defendingMonster.isMonsterAlive()) {
                    System.out.println(defendingMonster.getName() + " has been defeated!");
                    playerTwo.getDeckMonsters().remove(defendingMonster);
                }
            }


            if (playerOne.getDeckMonsters().isEmpty() || playerTwo.getDeckMonsters().isEmpty()) {
                gameOn = false;
            } else {
                round(playerTwo, playerOne);
                if (!defendingMonster.isMonsterAlive()) {
                    System.out.println(defendingMonster.getName() + " has been defeated!");
                    playerOne.getDeckMonsters().remove(defendingMonster);
                }
            }
        }
        Aesthetic aesthetic = new Aesthetic();
        if(playerOne.getDeckMonsters().isEmpty()){
            aesthetic.wonGame();
            System.out.println(playerTwo.getName()+" WON!");
        }
        if(playerTwo.getDeckMonsters().isEmpty()){
            aesthetic.wonGame();
            System.out.println(playerOne.getName()+" WON!");
        }
    }

}




