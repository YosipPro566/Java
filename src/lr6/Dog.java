package lr6;

public class Dog extends PetAbstract {
    private String breed;

    public Dog(Long id, String name, int age, String breed) {
        super(id, name, age);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof! 🐶";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Dog: breed=%s]", breed);
    }
}
