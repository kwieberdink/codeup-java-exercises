public class Recursion {
    // Always want to pass the lower value of its self so that it has a way
    // to get out of the recursion loop
    private static int sumOfNumbersMethod(int number) {
        if(number == 0) {
            return number;
        } else {
            return + number + sumOfNumbersMethod(number - 1);
        }
    }

    private static boolean isPalindromeMethod(String word) {
        if(word.length() == 0 || word.length() == 1) {
            return true;
        }
        if(word.charAt(0) == word.charAt(word.length()-1)) {
            return isPalindromeMethod(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
