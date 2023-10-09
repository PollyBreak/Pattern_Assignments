package hero.decorators;

import hero.Hero;

public class FlyingShoesDecorator extends HeroDecorator {
    int level =1;
    public FlyingShoesDecorator(Hero decoratedHero){
        super(decoratedHero);
        decoratedHero.setArmor(decoratedHero.getArmor()+level);
        decoratedHero.addAbility("flying");
    }

    @Override
    public String move() {
        return(super.move()+ " and flys");
    }

}
