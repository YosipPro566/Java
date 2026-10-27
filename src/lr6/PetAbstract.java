package lr6;

public abstract class PetAbstract {
    private Long id;
    private String name;
    private int age;

    public PetAbstract(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return String.format("Pet [ID=%d, Name=%s, Age=%d]", id, name, age);
    }
}
