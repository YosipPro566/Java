package lr4;

public interface FeedingStrategy {
    void feed();

    default void prepareBowl() {
        System.out.println("Cleaning bowl before feeding...");
    }
}
