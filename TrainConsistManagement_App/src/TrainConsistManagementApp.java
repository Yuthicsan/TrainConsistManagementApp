import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper");

        // Display final formation
        System.out.println("Train Formation: " + train);
    }
}