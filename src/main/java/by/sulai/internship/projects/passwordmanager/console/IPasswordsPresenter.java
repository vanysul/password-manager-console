package by.sulai.internship.projects.passwordmanager.console;


import java.util.Scanner;

public interface IPasswordsPresenter {

    void run();

    void addPassword(Scanner scanner);

    void updatePassword(Scanner scanner);

    void deletePassword(Scanner scanner);

    void listAllPasswords();
}
