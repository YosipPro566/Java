package lr4;

public class DryFoodFeeding implements FeedingStrategy {
    @Override
    public void feed() {
        System.out.println("Dispensing 100g of dry kibble food.");
    }
}
