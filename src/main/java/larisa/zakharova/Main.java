package larisa.zakharova;

public class Main {
    private static String msg = "Hello qa.guru!!!!";

    public static void main(String[] args) {

        System.out.printf(getMessage());

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }

    private static String getMessage() {
        return msg;
    }
}