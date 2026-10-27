package lr5;

import lr1.Pet;

public class MainLR5 {
    public static void main(String[] args) {
        Pet myDog = PetFactory.createPet("dog", "Rex", 3, 14.5);
        System.out.println("Created via Factory: " + myDog);
    }
}
