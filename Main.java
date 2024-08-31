import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ToDoList toDoList = new ToDoList();
            boolean running = true;
            
            while (running) {
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. View Tasks");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter task title: ");
                        String title = scanner.nextLine();
                        toDoList.addTask(new Task(title));
                    }
                    case 2 -> {
                        System.out.print("Enter task title to remove: ");
                        String titleToRemove = scanner.nextLine();
                        toDoList.removeTask(titleToRemove);
                    }
                    case 3 -> {
                        System.out.println("Tasks:");
                        System.out.println(toDoList);
                    }
                    case 4 -> {
                        running = false;
                        System.out.println("Exiting...");
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
