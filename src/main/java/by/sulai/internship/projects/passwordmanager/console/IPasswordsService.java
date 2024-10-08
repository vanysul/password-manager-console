package by.sulai.internship.projects.passwordmanager.console;

import java.util.Set;

<<<<<<< HEAD

import java.util.Set;

=======
>>>>>>> 0cb664dd0dbee241e8a9fb8c69aa4c149e721a7c
//todo определить контракт слоя бизнеса сущности Password
public interface IPasswordsService {

    boolean create(IPassword password);
<<<<<<< HEAD

    IPassword get(Integer id);

    Set<IPassword> get();

    boolean update(Integer id, IPassword password);

    boolean delete(Integer id);

=======
    IPassword get(Integer id);
    Set<IPassword> get();
    boolean update(Integer id, IPassword password);
    boolean delete(Integer id);
>>>>>>> 0cb664dd0dbee241e8a9fb8c69aa4c149e721a7c
}
