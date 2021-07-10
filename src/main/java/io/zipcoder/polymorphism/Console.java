package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dino;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private int numberOfPets;
    private ArrayList<Pet> petList = new ArrayList<Pet>();

    public void topMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        numberOfPets = scanner.nextInt();
        typeMenu();
    }

    public void typeMenu(){
        Scanner scanner = new Scanner(System.in);
        Integer petCount = 1;
        Integer input;
        while(petCount <= numberOfPets){
            System.out.println("What kind of pet is #" + petCount + "?");
            System.out.println("1:Cat\n2:Dog\n3:Dino");
            scanner = new Scanner(System.in);
            input = scanner.nextInt();
            //scanner.nextLine();

            switch (input){
                case 1:
                    petList.add(new Cat());
                    break;
                case 2:
                    petList.add(new Dog());
                    break;
                case 3:
                default:
                    petList.add(new Dino());
                    break;

            }
            petCount++;
        }
        nameMenu();
    }

    public void nameMenu(){
        Scanner scanner = new Scanner(System.in);
        String input;
        Integer petListIndex = 0;

        while(petListIndex < numberOfPets){
            System.out.println("What is the name of pet #" + (petListIndex + 1) +", who is a " +
                               petList.get(petListIndex).getClass().getSimpleName() + "?");
            //scanner.nextLine();
            input = scanner.nextLine();
            petList.get(petListIndex).setName(input);
            petListIndex++;
        }
        speakMenu();
    }

    public void speakMenu(){
        for(int i = 0; i < numberOfPets; i++){
            System.out.println(petList.get(i).getName() + " the " + petList.get(i).getClass().getSimpleName() +
                               " says " + petList.get(i).speak());
        }
    }

}
