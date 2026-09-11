package edu.course.lab01;

public final class QuadraticEquation {

    private QuadraticEquation() {
    }

    public static void solve(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Ошибка: коэффициент a не должен быть равен нулю, уравнение не является квадратным");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root = Math.sqrt(discriminant);
            double x1 = (-b + root) / (2 * a);
            double x2 = (-b - root) / (2 * a);
            System.out.printf("Два корня: x1 = %.6f, x2 = %.6f%n", x1, x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("Один корень: x = %.6f%n", x);
        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}