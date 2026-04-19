package selenium;

public class PalindromeNmber {

    public static void isPalindromeNumber(int input) {

        int original = input;
        int reverse = 0;
        while(input>0)
        {
            int digit = input%10;
            reverse = reverse *10 + digit;
            input = input/10;
        }

        if(original == reverse)
        {
            System.out.println("The given number is palindrome");
        }
        else
        {
            System.out.println("The given number is not palindrome");
        }
    }

    public static void main(String[] args) {
        int input = 1511;
        isPalindromeNumber(input);
    }
}
