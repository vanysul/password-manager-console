package by.sulai.internship.projects.passwordmanager.console;

public interface IPasswordsPresenter {

    /**
     * Точка логики: которая взаимодейтсвет с пользователем
     */
    void run();

    void create(IPassword password);
    void print(Integer id);
    void print();
    void update(Integer id, IPassword password);
    void delete(Integer id);


}
