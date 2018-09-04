package ru.valiullin.counter;

public class Counter {
    private static int count;

    public static void Counter(String obj) {
        ++count;
        System.out.println(obj);
    }

    public static int getCount() {
        return count;
    }
}
