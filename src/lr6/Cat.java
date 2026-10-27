package lr6;

public class Cat extends PetAbstract {
    private String color;

    public Cat(Long id, String name, int age, String color) {
        super(id, name, age);
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Meow! 🐱";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Cat: color=%s]", color);
    }
}
