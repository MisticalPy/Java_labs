package edu.course.lab01;

public final class SeriesCalculator {

    private SeriesCalculator() {
    }

    private static final double EPSILON = 1e-6;

    public static void compute() {
        double sum = 0.0;
        int count = 0;
        int lastN = 0;

        int n = 2;
        while (true) {
            double term = 1.0 / (n * n + n - 2);
            if (Math.abs(term) < EPSILON) {
                break;
            }
            sum += term;
            lastN = n;
            count++;
            n++;
        }

        System.out.printf("Сумма ряда: %.6f%n", sum);
        System.out.println("Последний добавленный n: " + lastN);
        System.out.println("Количество членов: " + count);
    }
}