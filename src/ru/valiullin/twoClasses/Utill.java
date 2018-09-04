package ru.valiullin.twoClasses;

public class Utill {
    public static void util() {
        Contract contract = new Contract();
        contract.setNumberOfContract(121548);
        contract.setDate("2018-08-18");
        contract.setListOfProducts(new String[]{"Product 1", "Product 2", "Product 3", "Product 4"});

        Act act = new Act();
        act.setNumberOfContract(contract.getNumberOfContract());
        act.setDate(contract.getDate());
        act.setListOfProducts(contract.getListOfProducts());

        System.out.println(act.toString());

    }
}
