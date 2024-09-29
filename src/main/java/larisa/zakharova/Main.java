package larisa.zakharova;

public class Main {
    private static String msg = "Hello qa.guru!";

    public static void main(String[] args) {

        System.out.printf(getMessage());
    }

    private static String getMessage() {
        return msg;
    }
}