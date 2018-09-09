package ru.valiullin.twoClasses;

public class Utill {
    public static Act convertToAct(Contract contract) {
        Act act = new Act();
        act.setNumberOfContract(contract.getNumberOfContract());
        act.setDate(contract.getDate());
        act.setListOfProducts(contract.getListOfProducts());
        System.out.println(act);
        return act;
    }
}
