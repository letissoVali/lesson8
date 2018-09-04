package ru.valiullin.calc;

public class Calc {
    public static double summ(double a, double b) {
        double total = a + b;
        return total;
    }
    public static double subtract(double a, double b) {
        double total = a - b;
        return total;
    }
    public static double multipl(double a,double b) {
        double total = a * b;
        return total;
    }
    public static double divide(double a, double b) {
        double total = a / b;
        return total;
    }

    public static double prcnt(double num, double prcnt) {
        final int FULLPRCNT = 100;
        double total = (num / FULLPRCNT) * prcnt;
        return total;
    }

    //длина окружности
    public static double circumference(double radius) {
        //FinalConst PI = new FinalConst(); - ненужно, спасибо статикам за это
        double circm = 2 * FinalConst.getPI() * radius;
        return circm;
    }
}
