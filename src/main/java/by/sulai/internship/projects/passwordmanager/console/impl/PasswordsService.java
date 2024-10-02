package by.sulai.internship.projects.passwordmanager.console.impl;

import by.sulai.internship.projects.passwordmanager.console.IPasswordsDao;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsService;

//todo Реализовать методы интерфейса + сингелтон
public class PasswordsService implements IPasswordsService {
    private final IPasswordsDao passwordsDao;

    public static final IPasswordsService getInstance(){
        return new PasswordsService(PasswordsInCollectionsDao.getInstance());
    }

    public PasswordsService(IPasswordsDao passwordsDao) {
        this.passwordsDao = passwordsDao;
    }
}
