import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jack");
        Player player2 = new Player("Ban");
        Player player3 = new Player("Ann");
        List<Player> players= new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        Game game = new Game(players);
        game.play();
    }
}