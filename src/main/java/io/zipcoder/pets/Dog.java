package io.zipcoder.pets;

public class Dog extends Pet{
    public Dog(){
        super("Woofsey");
    }

    public Dog(String name){
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
        return "Woof!";
    }

}
