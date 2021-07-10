package io.zipcoder.pets;

public class Cat extends Pet{
    public Cat(){
        super("Kittykens");
    }

    public Cat(String name){
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
        return "Meowww!";
    }
}
