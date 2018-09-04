package ru.valiullin.TwoClasses;

import java.util.Arrays;

public class Act {
    private int numberOfContract;
    private String date;
    private String[] listOfProducts;
//getters
    public int getNumberOfContract() {
        return numberOfContract;
    }

    public String getDate() {
        return date;
    }

    public String[] getListOfProducts() {
        return listOfProducts;
    }
//setters
    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setListOfProducts(String[] listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        return "Act{" +
                "numberOfContract=" + numberOfContract +
                ", date=" + date +
                ", listOfProducts=" + Arrays.toString(listOfProducts) +
                '}';
    }


}
