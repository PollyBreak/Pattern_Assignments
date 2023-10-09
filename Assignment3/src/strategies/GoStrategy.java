package strategies;

public class GoStrategy implements Moving {
    public String move(){
        return ("goes");
    }

    @Override
    public String toString() {
        return "GoStrategy";
    }
}
