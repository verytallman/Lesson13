package HW13.modules.executor;

import HW13.WrongLoginException;
import HW13.WrongPasswordException;

import java.util.Scanner;

public class ExecutorManager {
    public static void execute(){
        try {
            loginCheckerAndPassChecker();
        } catch (WrongLoginException e) {
            System.err.println(e.WrongLoginException());
//            e.printStackTrace();
        } catch (WrongPasswordException a) {
//            a.printStackTrace();
            System.err.println(a.WrongPasswordException());
        }
    }
        public static void loginCheckerAndPassChecker() throws WrongLoginException, WrongPasswordException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter your login:");
            String login = scanner.nextLine();

            final String LOGIN_PATTERN = "\\w{1,19}";
            if (login.matches(LOGIN_PATTERN)) {
                System.out.println(true);
            } else {
                throw new WrongLoginException();
            }

            System.out.println("Please, enter your password:");
            String password = scanner.nextLine();
            System.out.println("Please, confirm your password:");
            String confirmPassword = scanner.nextLine();

            final String PASSWORD_PATTERN = "\\w{1,19}";
            if (password.equals(confirmPassword) && password.matches(PASSWORD_PATTERN)) {
                System.out.println(true);
            } else
                throw new WrongPasswordException();
        }
}
