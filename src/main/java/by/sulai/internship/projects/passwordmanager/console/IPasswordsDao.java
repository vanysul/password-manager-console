package by.sulai.internship.projects.passwordmanager.console;
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
}
