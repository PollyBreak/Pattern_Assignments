import hero.*;
import hero.decorators.FlyingShoesDecorator;
import hero.decorators.HeroDecorator;
import hero.decorators.IronArmorDecorator;
import hero.decorators.MagicWondDecorator;
import strategies.FlyStrategy;
import strategies.GoStrategy;
import strategies.Moving;
import strategies.SwimmingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();

        Moving goingStrategy = new GoStrategy();
        Moving flyStrategy = new FlyStrategy();
        Moving swimStrategy = new SwimmingStrategy();

        Hero one = new SimpleHero("fairy", flyStrategy);
        Hero two = new SimpleHero("human", goingStrategy);
        Hero three = new SimpleHero("mermaid", swimStrategy);
        Hero four = new SimpleHero("lizard", goingStrategy);

        //// adding decorators ////
        Hero twoWithDecorators = new MagicWondDecorator(two);
        twoWithDecorators = new FlyingShoesDecorator(twoWithDecorators);

        Hero oneWithDecorators = new IronArmorDecorator(one);

        Hero threeWithDecorators = new MagicWondDecorator(three);

        Hero fourWithDecorators = new FlyingShoesDecorator(four);
        fourWithDecorators = new MagicWondDecorator(fourWithDecorators);
        fourWithDecorators = new IronArmorDecorator(fourWithDecorators);
        //// adding decorators ////

        heroList.add(twoWithDecorators);
        heroList.add(oneWithDecorators);
        heroList.add(threeWithDecorators);
        heroList.add(fourWithDecorators);

        for (Hero hero: heroList){
            System.out.println(hero);
            System.out.println(hero.say());
            System.out.println(hero.hit());
            System.out.println(hero.move());
            System.out.println("-------");

        }


    }
}