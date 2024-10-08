package by.sulai.internship.projects.passwordmanager.console;
<<<<<<< HEAD
import java.util.List;
//todo определить контракт слоя доступа к данным сущности Password
public interface IPasswordsDao {

    void createPassword(IPassword password);

    IPassword getPasswordById(int id);

    void updatePassword(IPassword password);

    void deletePassword(int id);

    List<IPassword> getAllPasswords();

    List<IPassword> findPasswordsByUsername(String username);

    List<IPassword> findPasswordsByUrl(String url);
=======

//todo определить контракт слоя доступа к данным сущности Password
public interface IPasswordsDao {
>>>>>>> 0cb664dd0dbee241e8a9fb8c69aa4c149e721a7c
}
