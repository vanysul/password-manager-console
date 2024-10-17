package by.sulai.internship.projects.passwordmanager.console.impl;

import by.sulai.internship.projects.passwordmanager.console.IPassword;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//todo хранилище на коллекциях
//todo Реализовать методы интерфейса + сингелтон
public class PasswordsInCollectionsDao implements IPasswordsDao {
    private static volatile PasswordsInCollectionsDao instance;
    private List<IPassword> passwords;
    private PasswordsInCollectionsDao() {
        passwords = new ArrayList<>();
    }

    public static PasswordsInCollectionsDao getInstance() {
        if (instance == null) {
            synchronized (PasswordsInCollectionsDao.class) {
                if (instance == null) {
                    instance = new PasswordsInCollectionsDao();
                }
            }
        }
        return instance;
    }
    @Override
    public void createPassword(IPassword password) {
        passwords.add(password);
    }

    @Override
    public IPassword getPasswordById(int id) {
        Optional<IPassword> password = passwords.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
        return password.orElse(null);
    }

    @Override
    public void updatePassword(IPassword updatedPassword) {
        for (int i = 0; i < passwords.size(); i++) {
            if (passwords.get(i).getId() == updatedPassword.getId()) {
                passwords.set(i, updatedPassword);
                return;
            }
        }
    }


    @Override
    public void deletePassword(int id) {
        passwords.removeIf(password -> password.getId() == id);
    }


    @Override
    public List<IPassword> getAllPasswords() {
        return new ArrayList<>(passwords);  }


    @Override
    public List<IPassword> findPasswordsByUsername(String username) {
        List<IPassword> result = new ArrayList<>();
        for (IPassword password : passwords) {
            if (password.getUsername().equals(username)) {
                result.add(password);
            }
        }
        return result;
    }

    @Override
    public List<IPassword> findPasswordsByUrl(String url) {
        List<IPassword> result = new ArrayList<>();
        for (IPassword password : passwords) {
            if (password.getUrl().equals(url)) {
                result.add(password);
            }
        }
        return result;
    }
}

