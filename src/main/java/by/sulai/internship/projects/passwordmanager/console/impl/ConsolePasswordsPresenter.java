package by.sulai.internship.projects.passwordmanager.console.impl;

import by.sulai.internship.projects.passwordmanager.console.IPassword;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsPresenter;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsService;


//todo Реализовать методы интерфейса + сингелтон
public class ConsolePasswordsPresenter implements IPasswordsPresenter {

    private final IPasswordsService passwordsService;

    //todo
    public static final IPasswordsPresenter getInstance() {
        return new ConsolePasswordsPresenter(PasswordsService.getInstance());
    }


    public ConsolePasswordsPresenter(IPasswordsService passwordsService) {
        this.passwordsService = passwordsService;
    }

    public void run() {
        //todo взаимодействоать с пользователем через консоль
    }

    public void create(IPassword password) {
        //todo use passwordsService and print into os
    }

    public void print(Integer id) {
        //todo use passwordsService and print into os
    }

    public void print() {
        //todo use passwordsService and print into os
    }

    public void update(Integer id, IPassword password) {
        //todo use passwordsService and print into os
    }

    public void delete(Integer id) {
        //todo use passwordsService and print into os
    }
}
