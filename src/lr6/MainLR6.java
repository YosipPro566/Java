package lr6;

public class MainLR6 {
    public static void main(String[] args) {
        PetAbstract dog = new Dog(1L, "Rex", 3, "Labrador");
        PetAbstract cat = new Cat(2L, "Murka", 2, "Black");

        System.out.println(dog);
        System.out.println(dog.makeSound());

        System.out.println(cat);
        System.out.println(cat.makeSound());
    }
}
