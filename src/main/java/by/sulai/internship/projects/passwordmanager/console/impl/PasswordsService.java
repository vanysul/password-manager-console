package by.sulai.internship.projects.passwordmanager.console.impl;

import by.sulai.internship.projects.passwordmanager.console.IPassword;
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
    }
}
