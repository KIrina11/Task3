package ru.vsu.cs.kislova_i_v;

import java.util.Objects;

public class TestCase {
    public static boolean checkCorrectnessOfGetColor(Picture  picture) {
        double[] variablesX = {0, -4, 4, 8.5, -1.25, -0.05, 4.5, 2, 1, 10};
        double[] variablesY = {0, 1, -5, -10, 2, 0.05, -5, 0, -5, 0.005};

        SimpleColor[] variablesCorrectColors = {SimpleColor.YELLOW, SimpleColor.GREY, SimpleColor.BLUE,
                SimpleColor.BLUE, SimpleColor.ORANGE, SimpleColor.YELLOW, SimpleColor.BLUE, SimpleColor.YELLOW,
                SimpleColor.GREY, SimpleColor.ORANGE};

        System.out.println("The program is being checked for correct operation...");
        int k = 0;

        for (int i = 0; i < variablesCorrectColors.length; i++) {
            System.out.printf("(%s, %s) -> %s", variablesX[i], variablesY[i], variablesCorrectColors[i]);

            if (Objects.equals(picture.getColor(variablesX[i], variablesY[i]), variablesCorrectColors[i])) {
                System.out.println(" Test " + (i + 1) + " showed that the program is correct");
                k += 1;
            }
        }

        if (k == variablesCorrectColors.length) {
            System.out.println("Success! The program is working correctly");
            return true;
        } else {
            System.out.println("Error! The program is working incorrectly");
            return false;
        }
    }
}
