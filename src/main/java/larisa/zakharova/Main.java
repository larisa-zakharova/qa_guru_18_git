package larisa.zakharova;

public class Main {
    public static void main(String[] args) {

        System.out.printf(getMessage());

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }

    private static String getMessage() {
        return "Hello qa.guru";
    }
}