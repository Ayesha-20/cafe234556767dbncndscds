package main;

    public class Coffee implements Beverage {

    int cost2;
    String Desc;

        @Override
        public void getCost(String s) {
            cost2 = 150;
        }

    // to get the description
    @Override
    public void getDescription(String Coffee) {

        Desc = Coffee;
    }
}
