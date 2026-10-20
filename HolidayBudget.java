import java.util.Scanner;

public class HolidayBudget {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double budget, totalCost = 0;
        int destinationCount = 0;

        System.out.println("=== HOLIDAY TRIP PLANNER ===");

        System.out.print("Enter your trip budget: $");
        budget = input.nextDouble();
        input.nextLine();

        String moreDestinations = "yes";

        // Outer while loop
        while (moreDestinations.equalsIgnoreCase("yes")) {

            System.out.print("\nEnter destination name: ");
            String destination = input.nextLine();

            destinationCount++;

            String moreActivities = "yes";
            double destinationCost = 0;

            // Nested while loop
            while (moreActivities.equalsIgnoreCase("yes")) {

                System.out.print("Enter activity name: ");
                String activity = input.nextLine();

                System.out.print("Enter activity cost: $");
                double cost = input.nextDouble();
                input.nextLine();

                // If-else statement
                if (cost >= 0) {
                    destinationCost += cost;
                    totalCost += cost;

                    System.out.println(
                            activity + " added to " + destination
                    );

                    if (totalCost > budget) {
                        System.out.println(
                                "Warning: Your trip is over budget!"
                        );
                    } else {
                        System.out.println(
                                "Your trip is within budget."
                        );
                    }

                } else {
                    System.out.println(
                            "Invalid cost. Please enter a positive amount."
                    );
                }

                System.out.print(
                        "Add another activity? (yes/no): "
                );
                moreActivities = input.nextLine();
            }

            System.out.printf(
                    "Total cost for %s: $%.2f%n",
                    destination, destinationCost
            );

            System.out.print(
                    "Plan another destination? (yes/no): "
            );
            moreDestinations = input.nextLine();
        }

        // Calculate remaining money
        double remaining = budget - totalCost;

        System.out.println("\n=== TRIP SUMMARY ===");
        System.out.println("Destinations visited: " + destinationCount);
        System.out.printf("Trip budget: $%.2f%n", budget);
        System.out.printf("Total trip cost: $%.2f%n", totalCost);
        System.out.printf("Money remaining: $%.2f%n", remaining);

        // If-else statement
        if (totalCost <= budget) {
            System.out.println("Great! Your trip is within budget.");
        } else {
            System.out.println("You need to reduce your trip expenses.");
        }

        System.out.println("Enjoy planning your holiday!");

        input.close();
    }
}





