package edu.course.lab01;

public final class TextTasks {

    private TextTasks() {
    }

    public static String reverse(String source) {
        StringBuilder result = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            result.append(source.charAt(i));
        }
        return result.toString();
    }

    public static boolean isPalindrome(String source) {
        int left = 0;
        int right = source.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(source.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(source.charAt(right))) {
                right--;
            }

            if (left >= right) {
                break;
            }

            char leftChar = Character.toLowerCase(source.charAt(left));
            char rightChar = Character.toLowerCase(source.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}