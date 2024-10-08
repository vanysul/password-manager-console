package by.sulai.internship.projects.passwordmanager.console.impl;

import by.sulai.internship.projects.passwordmanager.console.IPassword;
<<<<<<< HEAD
import by.sulai.internship.projects.passwordmanager.console.IPasswordsService;

import java.util.HashSet;
import java.util.Set;
//todo Реализовать методы интерфейса + сингелтон
public class PasswordsService implements IPasswordsService {

    private static PasswordsService instance;
    private Set<IPassword> passwords;

    public static PasswordsService getInstance() {
        if (instance == null) {
            instance = new PasswordsService();
        }
        return instance;
    }

    private PasswordsService() {
        this.passwords = new HashSet<>();
    }

    @Override
    public boolean create(IPassword password) {

        return passwords.add(password);
    }

    @Override
    public IPassword get(Integer id) {
        return passwords.stream()
                .filter(password -> password.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Set<IPassword> get() {
        return passwords;
    }

    @Override
    public boolean update(Integer id, IPassword updatedPassword) {
        IPassword existingPassword = get(id);
        if (existingPassword != null) {
            existingPassword.setUsername(updatedPassword.getUsername());
            existingPassword.setPassword(updatedPassword.getPassword());
            existingPassword.setUrl(updatedPassword.getUrl());
            return true;
        }
        return false;
    }
    @Override
    public boolean delete(Integer id) {
        return passwords.removeIf(password -> password.getId() == id);
=======
import by.sulai.internship.projects.passwordmanager.console.IPasswordsDao;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsService;

import java.util.Set;

//todo Реализовать методы интерфейса + сингелтон
public class PasswordsService implements IPasswordsService {
    private final IPasswordsDao passwordsDao;

    public static final IPasswordsService getInstance(){
        return new PasswordsService(PasswordsInCollectionsDao.getInstance());
    }

    public PasswordsService(IPasswordsDao passwordsDao) {
        this.passwordsDao = passwordsDao;
    }

    public boolean create(IPassword password) {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public IPassword get(Integer id) {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public Set<IPassword> get() {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public boolean update(Integer id, IPassword password) {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public boolean delete(Integer id) {
        //todo impl
        throw new UnsupportedOperationException();
>>>>>>> 0cb664dd0dbee241e8a9fb8c69aa4c149e721a7c
    }
}
