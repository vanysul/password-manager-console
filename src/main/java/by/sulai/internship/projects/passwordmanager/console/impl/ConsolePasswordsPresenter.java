package by.sulai.internship.projects.passwordmanager.console.impl;

import by.sulai.internship.projects.passwordmanager.console.IPassword;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsPresenter;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsService;

import java.util.Scanner;
import java.util.Set;
//todo Реализовать методы интерфейса + сингелтон
public class ConsolePasswordsPresenter implements IPasswordsPresenter {

    private static ConsolePasswordsPresenter instance;
    private final IPasswordsService passwordsService;


    public static IPasswordsPresenter getInstance() {
        if (instance == null) {
            instance = new ConsolePasswordsPresenter(PasswordsService.getInstance());
        }
        return instance;
    }

    public ConsolePasswordsPresenter(IPasswordsService passwordsService) {
        this.passwordsService = passwordsService;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPassword Manager");
            System.out.println("1. Add new password");
            System.out.println("2. Update existing password");
            System.out.println("3. Delete a password");
            System.out.println("4. Show all passwords");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPassword(scanner);
                    break;
                case 2:
                    updatePassword(scanner);
                    break;
                case 3:
                    deletePassword(scanner);
                    break;
                case 4:
                    listAllPasswords();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    @Override
    public void addPassword(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter URL: ");
        String url = scanner.nextLine();

        IPassword newPassword = new Password();
        newPassword.setUsername(username);
        newPassword.setPassword(password);
        newPassword.setUrl(url);

        boolean created = passwordsService.create(newPassword);
        if (created) {
            System.out.println("Password added successfully.");
        } else {
            System.out.println("Error adding password.");
        }
    }

    @Override
    public void updatePassword(Scanner scanner) {
        System.out.print("Enter the ID of the password to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        IPassword password = passwordsService.get(id);
        if (password == null) {
            System.out.println("Password not found.");
            return;
        }

        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        System.out.print("Enter new URL: ");
        String url = scanner.nextLine();

        password.setUsername(username);
        password.setPassword(newPassword);
        password.setUrl(url);

        boolean updated = passwordsService.update(id, password);
        if (updated) {
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Error updating password.");
        }
    }

    @Override
    public void deletePassword(Scanner scanner) {
        System.out.print("Enter the ID of the password to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean deleted = passwordsService.delete(id);
        if (deleted) {
            System.out.println("Password deleted successfully.");
        } else {
            System.out.println("Error deleting password or password not found.");
        }
    }

    @Override
    public void listAllPasswords() {
        Set<IPassword> passwords = passwordsService.get();
        if (passwords.isEmpty()) {
            System.out.println("No passwords stored.");
        } else {
            for (IPassword password : passwords) {
                System.out.println("ID: " + password.getId() +
                        ", Username: " + password.getUsername() +
                        ", Password: " + password.getPassword() +
                        ", URL: " + password.getUrl());
            }
        }
    }
}
