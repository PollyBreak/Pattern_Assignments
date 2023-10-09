package hero.decorators;

import hero.Hero;

public class IronArmorDecorator extends HeroDecorator {
    int level=2;
    public IronArmorDecorator(Hero decoratedHero){
        super(decoratedHero);
        decoratedHero.setArmor(decoratedHero.getArmor()+level);
    }
}
