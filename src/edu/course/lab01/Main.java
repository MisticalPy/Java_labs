package edu.course.lab01;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        switch (args[0]) {
            case "fizzbuzz" -> FizzBuzz.print(1, 500);

            case "reverse" -> {
                if (args.length != 2) {
                    printUsage();
                    return;
                }
                System.out.println(TextTasks.reverse(args[1]));
            }

            case "quadratic" -> {
                if (args.length != 4) {
                    printUsage();
                    return;
                }
                double a = Double.parseDouble(args[1]);
                double b = Double.parseDouble(args[2]);
                double c = Double.parseDouble(args[3]);
                QuadraticEquation.solve(a, b, c);
            }

            case "series" -> SeriesCalculator.compute();

            case "palindrome" -> {
                if (args.length != 2) {
                    printUsage();
                    return;
                }
                System.out.println(TextTasks.isPalindrome(args[1]));
            }

            default -> printUsage();
        }
    }

    private static void printUsage() {
        System.out.println("Использование:");
        System.out.println("  fizzbuzz");
        System.out.println("  reverse <строка>");
        System.out.println("  quadratic <a> <b> <c>");
        System.out.println("  series");
        System.out.println("  palindrome <строка>");
    }
}