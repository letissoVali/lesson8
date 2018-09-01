package ru.valiullin.vendingMachine;

public class VendingMachine {
    private double money = 0;
    private String[] drinks;
        //конструкторы - по умолчанию и нет
    public VendingMachine() {
    }
    public VendingMachine(String[] drinks) {
        this.drinks = drinks;
    }

        //вводим денежные средства
    public void addMoney(double money) {
        this.money = money;
    }
        //проверяем напиток
    protected String getDrink(int key){
        if(key >= this.drinks.length) {
            return "none";
        } else {
            return this.drinks[key];
        }

    }

        //выдаем напиток
    public void giveMeADrink(int key){
        if (this.money > 0) {
            String drink = getDrink(key);
            if(drink != "none"){
                System.out.println("Возьмите ваш напиток: " + drink);
            } else {
                System.out.println("Такого напитка нет!" + this.drinks.length);
            }
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }
}

