import java.util.Scanner;

class TimeTask {

    // Encapsulation: private variables
    private String taskName;
    private Integer minutes;
    private Boolean completed;

    // Constructor
    public TimeTask(String taskName, Integer minutes, Boolean completed) {
        this.taskName = taskName;
        this.minutes = minutes;
        this.completed = completed;
    }

    // Getter methods
    public String getTaskName() {
        return taskName;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Boolean getCompleted() {
        return completed;
    }

    // Setter methods
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    // Display task information
    public void displayTask() {
        System.out.println("Task: " + taskName);
        System.out.println("Time: " + minutes + " minutes");
        System.out.println("Completed: " + completed);
    }
}

public class TimeOrganizer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an array for five tasks
        TimeTask[] tasks = new TimeTask[5];

        // Allow the user to enter five tasks
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter details for Task " + (i + 1));

            System.out.print("Enter your task: ");
            String task = input.nextLine();

            System.out.print("Enter time in minutes: ");
            Integer minutes = Integer.parseInt(input.nextLine());

            System.out.print("Is the task completed? (true/false): ");
            Boolean completed = Boolean.parseBoolean(input.nextLine());

            // Create a task object
            tasks[i] = new TimeTask(task, minutes, completed);
        }

        // Display all five tasks
        System.out.println("\nYour Schedule:");

        for (int i = 0; i < tasks.length; i++) {
            System.out.println("\nTask " + (i + 1));
            tasks[i].displayTask();
        }

        input.close();
    }
}