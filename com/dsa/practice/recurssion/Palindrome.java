package com.dsa.practice.recurssion;

public class Palindrome {

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (check(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
            }
        }

        return checkForPalindrome(stringBuilder.toString(), 0, stringBuilder.length() - 1);

    }

    private static boolean checkForPalindrome(String input, int start, int end) {

        if (start > end) {
            return true;
        }
        if (input.charAt(start) == input.charAt(end)) {
            return checkForPalindrome(input, start + 1, end - 1);
        }
        return false;
    }

    private static boolean check(char character) {

        return (character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z') || (character >= '0' && character <= '9');
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "abyuhucba";
        String s3 = "0P";


        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));

    }

}
// can be done passing simply string and start index.  end index can be caluclated as string.length -start-1