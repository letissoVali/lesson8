import ru.valiullin.calc.*;
import ru.valiullin.counter.*;
import ru.valiullin.twoClasses.*;
import ru.valiullin.vendingMachine.*;

import java.util.Scanner;

//-------------------------------------------------------
//todo Исправить ошибку в программе «Вендинговый автомат» (проверку длинны массива перенести в другой метод).
//todo Поэксперементировать с ключевым словом final
//todo Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
//сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробями.
//todo Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
//Написать метод для получения информации о количестве.
//todo Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
//Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
//--------------------------------------------------------


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //сканер - без объяснения
        //заполняем" автомат напитками;
        final String[] SOMEDRINKS = new String[] {"Чай черный", "Чай зеленый", "Кофе черный", "Американо", "Капучино"};
        VendingMachine vm = new VendingMachine(SOMEDRINKS);

        System.out.print("Введите денежные средства: ");
        if(scanner.hasNextDouble()){
            double money = scanner.nextDouble();
            vm.addMoney(money);
        } else {
            System.out.println("Введите денежные средства!!!");
        }
        System.out.print("Введите цифру желаймого напитка: ");
        if(scanner.hasNextInt()){
            int drink = scanner.nextInt();
            vm.giveMeADrink(drink);
        } else {
            System.out.println("Введите цифру напитка!!!");
        }

        //Calculator - working
        System.out.println(Calc.circumference(10));

        FinalConst.notFinal();

        Method.method();

        Utill.util();

    }
}

