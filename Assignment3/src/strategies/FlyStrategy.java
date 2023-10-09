package strategies;

public class FlyStrategy implements Moving {
    public String move(){
        return ("flys");
    }

    @Override
    public String toString() {
        return "FlyStrategy";
    }
}
