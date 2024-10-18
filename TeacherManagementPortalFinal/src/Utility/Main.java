package Utility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User("admin", "password");
        AuthService authService = new AuthService(user);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (authService.login(username, password)) {
            System.out.println("Login successful!");

            ManagementService managementService = new ManagementService();
            managementService.addStudent(new Student("John Doe", "S123"));
            managementService.addTeacher(new Teacher("Jane Smith", "Math"));
            managementService.addParent(new Parent("Alice Doe", "123-456-7890"));

            System.out.println("Students: " + managementService.getStudents().size());
            System.out.println("Teachers: " + managementService.getTeachers().size());
            System.out.println("Parents: " + managementService.getParents().size());
        } else {
            System.out.println("Login failed!");
        }

        scanner.close();
    }
}
