package lr3;

public class ValidatedPet {
    private String name;
    private double weight;

    public ValidatedPet(String name, double weight) throws InvalidPetDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPetDataException("Pet name cannot be empty!", weight);
        }
        if (weight <= 0) {
            throw new InvalidPetDataException("Weight must be greater than zero!", weight);
        }
        this.name = name.trim();
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
