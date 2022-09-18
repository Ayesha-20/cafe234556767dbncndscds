package main;

public class Cafe {
    public static void main (String[] args) {

        Object Desc = new Object();

        // Driver code for tea
        Tea tea = new Tea();
        tea.getCost("100");
        tea.getDescription(String.valueOf(Desc));

        System.out.println("Tea cost is: ");
        tea.getCost("100");

        // Driver code for coffee
        Coffee coffee = new Coffee();
        coffee.getCost("150");
        coffee.getDescription( String.valueOf(Desc));

        System.out.println("Coffee cost is :");
        coffee.getCost("150");


        // Driver code for Honey
        Honey honey = new Honey();
        honey.getCost("120");
        honey.getDescription( String.valueOf(Desc));

        System.out.println("TeawithHoney cost is :");
        honey.getCost("120");

        // Driver code for Creame
        Creame creame = new Creame();
        creame.getCost("170");
        creame.getDescription(String.valueOf(Desc));

        System.out.println("CoffeewithCream cost is :");
        creame.getCost("170");

        // Driver code for Caramel
        Caramel caramel = new Caramel();
        caramel.getCost("160");
        caramel.getDescription(String.valueOf(Desc));

        System.out.println("CoffeewithCaramel cost is :");
        caramel.getCost("160");

        // Driver code for Chocolate
        Chocolate chocolate = new Chocolate();
        chocolate.getCost("180");
        chocolate.getDescription(String.valueOf(Desc));

        System.out.println("CoffeewithChocolate cost is :");
        chocolate.getCost("180");
    }
}
