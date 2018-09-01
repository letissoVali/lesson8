import ru.valiullin.VendingMachine;
import ru.valiullin.VendingMachineForTea;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.addMoney(100);
        vm.giveMeADrink(3);

        VendingMachineForTea vmft = new VendingMachineForTea();
        vmft.addMoney(150);
        vmft.giveMeADrink(3);
    }
}

