package edu.course.lab01;

public final class FizzBuzz {

    private FizzBuzz() {
    }

    public static void print(int from, int to) {
        for (int i = from;i <= to;i++) {
            System.out.println(classify(i));
        }
    }

    private static String classify(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        }
        if (number % 5 == 0) {
            return "fizz";
        }
        if (number % 7 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}

