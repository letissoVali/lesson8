package ru.valiullin.TwoClasses;

import java.util.Arrays;
import java.util.Date;

public class Contract {
    private int numberOfContract;
    private String date;
    private String[] listOfProducts;
/*//constructor
    public Contract() {
    }

    public Contract(int numberOfContract, Date date, String[] listOfProducts) {
        this.numberOfContract = numberOfContract;
        this.date = date;
        this.listOfProducts = listOfProducts;
    }*/
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
//setter
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
        return "Contract{" +
                "numberOfContract=" + numberOfContract +
                ", date=" + date +
                ", listOfProducts=" + Arrays.toString(listOfProducts) +
                '}';
    }

}
