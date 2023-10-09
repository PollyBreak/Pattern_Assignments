package hero;

import strategies.Moving;

public class SimpleHero extends Hero {


    public SimpleHero(String name, Moving moving) {
        super(name, moving);
    }

    public String say(){
        return(this.getName()+ " says");
    }
    public String hit(){
        return (this.getName()+ " hits with damage " + Integer.toString(this.getStrength()));
    }
    public String move(){
        return(this.getName()+ " " + this.getMoving().move());
    }



}
