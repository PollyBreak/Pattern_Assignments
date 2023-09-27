public class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovingStrategy getMovingStrategy() {
        return movingStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    private MovingStrategy movingStrategy;

    public Hero(String name, MovingStrategy movingStrategy) {
        this.name = name;
        this.movingStrategy = movingStrategy;
    }

    public void say(){
        System.out.println(this.getName()+ " says");
    }
    public void hit(){
        System.out.println(this.getName()+ " hits");
    }
    public void move(){
        System.out.println(this.getName()+ " " + movingStrategy.move());
    }

}
