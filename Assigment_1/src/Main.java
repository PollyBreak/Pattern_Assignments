import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();
        MovingStrategy goingStrategy = new GoStrategy();
        MovingStrategy flyStrategy = new FlyStrategy();
        MovingStrategy swimStrategy = new SwimStrategy();
        Hero one = new Hero("fairy", flyStrategy);
        Hero two = new Hero("human", goingStrategy);
        Hero three = new Hero("mermaid", swimStrategy);
        Hero four = new Hero("lizard", goingStrategy);
        heroList.add(one);
        heroList.add(two);
        heroList.add(three);
        heroList.add(four);
        for (Hero hero: heroList){
            hero.move();
        }



    }
}