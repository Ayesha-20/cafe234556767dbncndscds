package main;

public class Tea implements Beverage {

    int cost1;
    String Desc;


    @Override
    public void getCost(String s) {

        cost1 = 100;
    }

    // to get the description
    @Override
    public void getDescription(String Tea) {

        Desc = Tea;
    }

}
