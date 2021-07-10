package io.zipcoder.pets;

public class Dino extends Pet{
    public Dino(){
        super("Dinoface");
    }

    public Dino(String name){
        super(name);
    }

    public void setName(String name){
        super.setName(name);
    }

    public String getName(){
        return super.getName();
    }

    @Override
    public String speak(){
        return "Roarrrr!!!";
    }

}
