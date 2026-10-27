package lr1;

import java.util.Scanner;

public class MainLR1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();

        System.out.print("Enter pet species: ");
        String species = scanner.nextLine();

        System.out.print("Enter pet age (years): ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter pet weight (kg): ");
        double weight = Double.parseDouble(scanner.nextLine());

        Pet pet = new Pet(name, species, age, weight);

        System.out.println("\n--- Pet Info ---");
        System.out.println(pet.toString());
        System.out.printf("Estimated daily food intake: %.2f grams%n", pet.calculateDailyFoodGram());

        scanner.close();
    }
}
