package lr2;

import java.util.Scanner;

import lr1.Pet;

public class MainLR2 {
    private static int readInt(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine().trim());
    }

    private static double readDouble(Scanner scanner) {
        return Double.parseDouble(scanner.nextLine().trim());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of pets: ");
        int count = readInt(scanner);

        Pet[] pets = new Pet[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("%nPet #%d:%n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Species: ");
            String species = scanner.nextLine();
            System.out.print("Age: ");
            int age = readInt(scanner);
            System.out.print("Weight: ");
            double weight = readDouble(scanner);

            pets[i] = new Pet(name, species, age, weight);
        }

        System.out.println("\n--- All Pets (for-each) ---");
        for (Pet pet : pets) {
            System.out.println(pet);
        }

        // Bubble Sort by Weight
        for (int i = 0; i < pets.length - 1; i++) {
            for (int j = 0; j < pets.length - i - 1; j++) {
                if (pets[j].getWeight() > pets[j + 1].getWeight()) {
                    Pet temp = pets[j];
                    pets[j] = pets[j + 1];
                    pets[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--- Sorted Pets by Weight (Bubble Sort) ---");
        for (Pet pet : pets) {
            System.out.println(pet);
        }

        scanner.close();
    }
}
