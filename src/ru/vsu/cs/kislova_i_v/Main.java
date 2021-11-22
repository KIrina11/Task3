package ru.vsu.cs.kislova_i_v;

import ru.vsu.cs.kislova_i_v.figures.Circle;
import ru.vsu.cs.kislova_i_v.figures.Line;
import ru.vsu.cs.kislova_i_v.figures.VerticalParabola;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Picture picture = new Picture(new Circle(2, -2, 3), new Line(-1, 0, -1),
                new VerticalParabola(3, -2, -1));

        if (TestCase.checkCorrectnessOfGetColor(picture)) {
            double x = readAndCheckCorrectVariablesXAndY("x");

            double y = readAndCheckCorrectVariablesXAndY("y");

            SimpleColor color = picture.getColor(x, y);

            printColorForPoint(x, y, color);
        }
    }

    public static double readAndCheckCorrectVariablesXAndY(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s: ", name);
        double value = scanner.nextDouble();
        if (Math.abs(value) <= 10) {
            return value;
        } else {
            System.out.println("You have gone beyond the limit of possible values."
                    + " Enter the value " + name + " again");
            return readAndCheckCorrectVariablesXAndY(name);
        }
    }

    public static void printColorForPoint(double x, double y, SimpleColor color) {
        System.out.printf("(%s, %s) -> %s", x, y, color);
    }
}
