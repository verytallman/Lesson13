package HW13;

//        Создать статический метод который принимает на вход три параметра:
//        login, password и confirmPassword.
//        Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//        Длина login должна быть меньше 20 символов.
//        Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.

//        Password должен содержать только латинские буквы, цифры и знак подчеркивания.
//        Длина password должна быть меньше 20 символов.
//        Также password и confirmPassword должны быть равны.
//        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.

//        WrongPasswordException и WrongLoginException -
//        пользовательские классы исключения с двумя конструкторами –
//        один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.

//        Обработка исключений проводится внутри метода.
//        Используем multi-catch block.
//        Метод возвращает true, если значения верны или false в другом случае.


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        loginCheckerAndPassChecker();


    }


    public static void loginCheckerAndPassChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your login: ");
        String login = scanner.nextLine();

        final String LOGIN_PATTERN = "\\w{1,19}";
        try {
            if (login.matches(LOGIN_PATTERN)) {
                System.out.println("Login correct");
            } else {
                System.out.println("Login incorrect");
                throw new WrongLoginException();
            }
        }catch (WrongLoginException e){

        }


        System.out.println("Please, enter your password: ");
        String password = scanner.nextLine();
        System.out.println("Please, confirm your password: ");
        String confirmPassword = scanner.nextLine();

        final String PASSWORD_PATTERN = "\\w{1,19}";

            if (password.equals(confirmPassword) && password.matches(PASSWORD_PATTERN)) {
                System.out.println("Password correct");
            } else
                System.out.println("Password incorrect");
        }
    }


