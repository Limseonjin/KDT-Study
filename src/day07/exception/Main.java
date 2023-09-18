package day07.exception;

import util.Utility;

public class Main {
    private static LoginUser user;

    public static void main(String[] args) throws LoginFailException {

        new LoginUser("abc123","1234");

        String id = Utility.input("ID :");
        String pw = Utility.input("PW :");

        try {
            String result = user.validate(id, pw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
