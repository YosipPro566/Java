package lr4;

public class MainLR4 {
    public static void main(String[] args) {
        FeedingStrategy dry = new DryFoodFeeding();

        System.out.println("--- Strategy Pattern Demo ---");
        dry.prepareBowl();
        dry.feed();
    }
}
