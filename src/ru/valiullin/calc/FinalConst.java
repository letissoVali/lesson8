package ru.valiullin.calc;

import java.util.Arrays;

public class FinalConst {
    private static final double PI = 3.14;
    private static final double ACCELERATIONOfGRAVITY = 9.8;

    final static private String[] FAMOUS = new String[] {"Альберт Эйнштейн", "Никола Тесла", "Искандер студень"};

    public static double getPI() {
        return PI;
    }

    public double getACCELERATIONOfGRAVITY() {
        return ACCELERATIONOfGRAVITY;
    }

    public String[] getFAMOUS() {
        return FAMOUS;
    }

    @Override
    public String toString() {
        return "FinalConst{" +
                "FAMOUS=" + Arrays.toString(FAMOUS) +
                '}';
    }

    public static void notFinal() {
        System.out.println(FAMOUS.hashCode());
        for (int i = 0; i < FAMOUS.length; i++) {
            if(FAMOUS[i] != "Искандер студень") {
                System.out.println("It's a famous person");
            } else {
                System.out.println(FAMOUS[i] + FAMOUS[i].hashCode()); //почему хэш код в минус ушел?
                FAMOUS[i] = "Ампер";
                System.out.println(FAMOUS[i] + FAMOUS[i].hashCode()); //А здесь не в минус
            }
        }
    }

}
