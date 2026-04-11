import java.util.*;

public class Otest {

    static class DivisionException extends Exception {
        @Override
        public String toString() {
            return "Division by 3 is not allowed";
        }
    }

    public static int divide(int a, int b) throws DivisionException {
        if (b == 3) {
            throw new DivisionException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            int result = divide(x, y);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}