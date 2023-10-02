public class Player implements Listener{
//    private int last_dice;
    private String name;

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    private boolean inGame =true;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int roll_dice(){
        int dice=(int) (Math.random() * 6)+1;
        System.out.println(name + " rolled "+dice);
        return (int) dice;
    }

    public void update(Object inGame){
        setInGame((boolean) inGame);
        if(!isInGame()){
            System.out.println(name+ " left the game.");
        }
    }
}
