import ru.valiullin.VendingMachine;
import java.util.Scanner;
//import ru.valiullin.VendingMachineForTea;


//todo Исправить ошибку в программе «Вендинговый автомат» (проверку длинны массива перенести в другой метод).
//todo Поэксперементировать с ключевым словом final
//todo Задания на static будут добавлены позже
//keep it simple или сделать проверку стоимости напитка?


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //сканер - без объяснения
        //заполняем" автомат напитками;
        String[] someDrinks = new String[] {"Чай черный", "Чай зеленый", "Кофе черный", "Американо", "Капучино"};
        VendingMachine vm = new VendingMachine(someDrinks);
        vm.addMoney(100);
        vm.giveMeADrink(5);




        /*VendingMachineForTea vmft = new VendingMachineForTea();
        vmft.addMoney(150);
        vmft.giveMeADrink(3);*/
    }
}

