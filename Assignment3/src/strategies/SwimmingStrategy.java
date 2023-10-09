package strategies;

public class SwimmingStrategy implements Moving {
    public String move(){
        return ("swims");
    }

    @Override
    public String toString() {
        return "SwimStrategy";
    }
}
