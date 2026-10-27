package lr1;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;

    public Pet(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateDailyFoodGram() {
        return this.weight * 25.0;
    }

    @Override
    public String toString() {
        return String.format("Pet[Name: %s, Species: %s, Age: %d y.o., Weight: %.2f kg]",
                name, species, age, weight);
    }
}
