package lr3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLR3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter pet name: ");
            String name = scanner.nextLine();

            System.out.print("Enter pet weight: ");
            double weight = scanner.nextDouble();

            ValidatedPet pet = new ValidatedPet(name, weight);
            System.out.println("Successfully created pet: " + pet.getName() + ", " + pet.getWeight() + " kg");

        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid numeric input format.");
        } catch (InvalidPetDataException e) {
            System.err.println("Domain Error: " + e.getMessage() + " (Provided value: " + e.getInvalidValue() + ")");
        } finally {
            System.out.println("Validation process completed.");
            scanner.close();
        }
    }
}
