package hero;

import strategies.Moving;

import java.util.ArrayList;

public abstract class Hero {
    private String name;
    private int strength;
    private int armor;
    private Moving moving;
    private ArrayList<String> extraAbilities = new ArrayList<>();
    public abstract String say();
    public abstract String hit();
    public abstract String move();
    public Hero(){};
    public Hero(String name, Moving moving) {
        this.name = name;
        this.moving = moving;
        strength = 1;
        armor = 0;
        extraAbilities = new ArrayList<>();
    }

    public Hero(String name, int strength, int armor, Moving moving, ArrayList<String> extraAbilities) {
        this.name = name;
        this.strength = strength;
        this.armor = armor;
        this.moving = moving;
        this.extraAbilities = extraAbilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Moving getMoving() {
        return moving;
    }

    public void setMoving(Moving moving) {
        this.moving = moving;
    }

    public ArrayList<String> getExtraAbilities() {
        return extraAbilities;
    }

    public void setExtraAbilities(ArrayList<String> extraAbilities) {
        this.extraAbilities = extraAbilities;
    }

    public void addAbility(String ability){
        this.getExtraAbilities().add(ability);
    }


    @Override
    public String toString() {
        return "Hero:" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", armor=" + armor +
                ", moving=" + moving +
                ", extraAbilities=" + extraAbilities;
    }

}
