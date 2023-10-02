import java.util.List;

public class Game {

    public boolean isNotfinished() {
        return notfinished;
    }

    boolean notfinished;
    List<Player> playerList;

    public Game(List<Player> playerList) {
        this.playerList = playerList;
        notfinished =true;
    }

    public void finishGame(){
        System.out.println("-----Game finished-----");
    }

    public boolean makeTurn(){
        for(Player player:playerList){
            if (player.roll_dice()==1){
                notfinished =false;
            }
        }
        return notfinished;
    }

    public void play(){
        while (notfinished){
            setState();
        }
    }

    public void setState() {
        this.notfinished = makeTurn();
        if (!notfinished) {
            finishGame();
        }
        for (Player player:playerList){
            player.update(notfinished);
        }
        if (notfinished) {
            System.out.println("--------Next Turn---------");
        }

    }

}
