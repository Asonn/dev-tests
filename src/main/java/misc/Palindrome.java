package misc;

/**
 * Created by wesley on 11/11/2019.
 */
public class Palindrome {

    public static boolean isPalindrome(String word) {
        StringBuilder wordBuilder = new StringBuilder(word);
        StringBuilder reverseWordBuilder = wordBuilder.reverse();
        return (reverseWordBuilder.toString()).equalsIgnoreCase(word);
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
