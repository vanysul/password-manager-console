package by.sulai.internship.projects.passwordmanager.console;

import java.util.Set;


import java.util.Set;

//todo определить контракт слоя бизнеса сущности Password
public interface IPasswordsService {

    boolean create(IPassword password);

    IPassword get(Integer id);

    Set<IPassword> get();

    boolean update(Integer id, IPassword password);

    boolean delete(Integer id);

}
