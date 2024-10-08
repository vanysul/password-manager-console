package by.sulai.internship.projects.passwordmanager.console;

//todo определить контракт POJO сущности Password

public interface IPassword {

    int getId();

    void setId(int id);

    String getPassword();

    void setPassword(String password);

    String getUsername();

    void setUsername(String username);

    String getUrl();

    void setUrl(String url);
}
