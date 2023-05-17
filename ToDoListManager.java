import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

public class ToDoListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();

        System.out.println("To-Do List Manager");
        System.out.println("------------------");

        char choice;
        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Enter the name of the task: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the description of the task: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(name, description));
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the index of the task to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (editIndex >= 0 && editIndex < tasks.size()) {
                        System.out.print("Enter the new name of the task: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter the new description of the task: ");
                        String newDescription = scanner.nextLine();

                        Task taskToEdit = tasks.get(editIndex);
                        taskToEdit = new Task(newName, newDescription);
                        tasks.set(editIndex, taskToEdit);

                        System.out.println("Task edited successfully!");
                    } else {
                        System.out.println("Invalid task index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter the index of the task to remove: ");
                    int removeIndex = scanner.nextInt();

                    if (removeIndex >= 0 && removeIndex < tasks.size()) {
                        Task removedTask = tasks.remove(removeIndex);
                        System.out.println("Task removed: " + removedTask.getName());
                    } else {
                        System.out.println("Invalid task index!");
                    }
                    break;

                case 4:
                    System.out.println("\nTasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        Task task = tasks.get(i);
                        System.out.println("Task " + (i + 1) + ":");
                        System.out.println("Name: " + task.getName());
                        System.out.println("Description: " + task.getDescription());
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (Character.toUpperCase(choice) == 'Y');

        scanner.close();
    }
}
