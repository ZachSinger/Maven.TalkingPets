package io.zipcoder.pets;

public class Pet {
    private String name;

    public Pet(){
        this.name = "Pet Name";
    }

    public Pet(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "I don't know who I am. I don't know how I got here. I only know that I must speak.";
    }


}
