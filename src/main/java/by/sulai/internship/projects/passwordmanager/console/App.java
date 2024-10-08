package by.sulai.internship.projects.passwordmanager.console;

import by.sulai.internship.projects.passwordmanager.console.impl.ConsolePasswordsPresenter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IPasswordsPresenter passwordsPresenter = ConsolePasswordsPresenter.getInstance();
        passwordsPresenter.run();
    }
}
