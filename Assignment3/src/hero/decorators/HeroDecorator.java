package hero.decorators;

import hero.Hero;

public class HeroDecorator extends Hero {
    protected Hero decoratedHero;

    public HeroDecorator(Hero decoratedHero) {
        this.decoratedHero = decoratedHero;
    }

    public String say(){
        return decoratedHero.say();
    }
    public String hit(){
        return decoratedHero.hit();
    }
    public String move(){
        return decoratedHero.move();
    }
    public int getStrength(){
        return decoratedHero.getStrength();
    }
    public void setStrength(int strength){
        decoratedHero.setStrength(strength);
    }
    @Override
    public void setArmor(int armor) {
        decoratedHero.setArmor(armor);
    }
    @Override
    public int getArmor() {
        return decoratedHero.getArmor();
    }
    @Override
    public void addAbility(String ability) {
        decoratedHero.addAbility(ability);
    }

    @Override
    public String toString() {
        return decoratedHero.toString();
    }
}
