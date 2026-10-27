package lr5;

import lr1.Pet;

public class PetFactory {
    public static Pet createPet(String type, String name, int age, double weight) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Pet(name, "Dog", age, weight);
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Pet(name, "Cat", age, weight);
        }
        return new Pet(name, "Unknown", age, weight);
    }
}
