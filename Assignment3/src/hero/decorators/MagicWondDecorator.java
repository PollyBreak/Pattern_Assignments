package hero.decorators;

import hero.Hero;

public class MagicWondDecorator extends HeroDecorator {
    public MagicWondDecorator(Hero decoratedHero) {
        super(decoratedHero);
        decoratedHero.addAbility("Magic");
        decoratedHero.setStrength(decoratedHero.getStrength()+1);
    }

    @Override
    public String hit() {
        return super.hit() + " and " + castMagic();
    }

    public String castMagic(){
        return "makes magic";
    }

}
