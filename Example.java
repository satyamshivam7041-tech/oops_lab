import java.util.*;

abstract class StringOperations {
    public abstract String reverse(String s);
    public abstract int vowelCount(String s);
}

abstract class StringReverse extends StringOperations {
    public String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}

class UpdatedStrings extends StringReverse {
    public int vowelCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count; // FIXED: semicolon added
    }
}

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        UpdatedStrings str = new UpdatedStrings();

        System.out.println("Reverse of " + s + " is " + str.reverse(s));
        System.out.println("Vowel count of " + s + " is " + str.vowelCount(s));
    }
}