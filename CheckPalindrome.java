// This Class Checks if a String is a Palindrome
public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.print(isPalindrome(str));
    }
	public static boolean isPalindrome(String input) {
		if(input.equals(reverse(input))) {
			return true;
		}
		return false;
	}
	public static String reverse(String input) {
		if(input == "null" || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length()-1) + reverse(input.substring(0,input.length()-1));
	}
}
