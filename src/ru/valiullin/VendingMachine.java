package ru.valiullin;

public class VendingMachine {
    private double money = 0;
    private String[] drinks = new String[] {"Кока-кола", "Спрайт", "Фанта"};

    public void addMoney(double money) {
        this.money = money;
    }

    protected String getDrink(int key){
        return this.drinks[key];
    }

    public void giveMeADrink(int key){
        if (this.money > 0) {
            if (key > this.drinks.length-1) {
                System.out.println("Такого напитка нет!" + this.drinks.length);
            } else {
                String drink = getDrink(key);
                System.out.println("Возьмите ваш напиток: " + drink);
            }
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }
}

