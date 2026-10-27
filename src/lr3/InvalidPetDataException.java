package lr3;

public class InvalidPetDataException extends Exception {
    private final double invalidValue;

    public InvalidPetDataException(String message, double invalidValue) {
        super(message);
        this.invalidValue = invalidValue;
    }

    public double getInvalidValue() {
        return invalidValue;
    }
}
