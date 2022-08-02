import java.util.ArrayList;
class TestCafe{

    public static void main(String[] args){

    CafeUtil cafe = new CafeUtil();

    System.out.println("\n----- Streak Goal Test -----");
    int streakGoal = cafe.getStreakGoal(10);
    System.out.println("purchase needed by week 10"+ streakGoal);


    System.out.println("\n----- Order total test-----");
    double [] prices = {2.99,3.99,5.99,2.45};
    double sumPrices = cafe.getOrderTotal(prices);
    System.out.println("Order total"+ sumPrices);


    System.out.println("\n----- Display menu test-----");
    ArrayList<String> menu = new ArrayList<String>();
    menu.add("drip coffee");
    menu.add("cappuccino");
    menu.add("latte");
    menu.add("mocha");
    cafe.displayMenu(menu);


    System.out.println("\n----- Add customer test-----");
    ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
                cafe.addCustomer(customers);
                System.out.println("\n");
        }
    }

}