package ru.valiullin.counter;

public class Method {
    public static void method() {
        Counter.Counter("Объект № " + Counter.getCount());
        Counter.Counter("Объект № " + Counter.getCount());
        Counter.Counter("Объект № " + Counter.getCount());
    }

}
