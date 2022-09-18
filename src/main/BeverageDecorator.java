package main;

public abstract class BeverageDecorator implements Beverage {

}
        // to add Honey with tea
        class Honey extends Tea{

            int cost3;
            String Desc;

            // to get the cost of teawithhoney
            @Override
            public void getCost(String s){

                cost3 = 120;
            }

            // to get the description
            @Override
            public void getDescription(String TeawithHoney){

                Desc = TeawithHoney;
            }

        }

     // to add coffee with creame
     class Creame extends Coffee{

     int cost4;
     String Desc;

    // to get the cost
     @Override
     public void getCost(String s){

        cost4 = 170;
    }

    // to get the description
    @Override
    public void getDescription(String Coffewithcreame){

        Desc = Coffewithcreame;
    }

}

    // to add Caramel with Coffee
    class Caramel extends Coffee{

    int cost5;
    String Desc;

    // to change gear
    @Override
    public void getCost(String s){

        cost5 = 160;
    }

    // to get the description
    @Override
    public void getDescription(String Coffeewithcaramel){

        Desc = Coffeewithcaramel;
    }

}

     // to add chocolate with coffee
     class Chocolate extends Coffee{

    int cost6;
    String Desc;

    // to change gear
    @Override
    public void getCost(String s){

        cost6 = 180;
    }

    // to get the description
    @Override
    public void getDescription(String CoffeewithChocolate){

        Desc = CoffeewithChocolate;
    }

}

