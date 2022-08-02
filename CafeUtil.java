import java.util.ArrayList;
class CafeUtil{

    
    int getStreakGoal(int numWeeks){
        int streakGoal = 0;
        for(int i = 1; i< numWeeks +1;i++ ){
            streakGoal+= i; 
        }
        return streakGoal;
    }

    double getOrderTotal(double[] prices){

        double sumPrices = 0;

        for(double price:prices){
            sumPrices += price;
        }

        return sumPrices;

    }

    void displayMenu(ArrayList<String> menuItems){
        for( String item :menuItems){
            System.out.println(menuItems.indexOf(item) +"--" +item);

        }
    }

    void addCustomer(ArrayList<String> customers){

        System.out.println("please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello "+ userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.print(customers);
    }
}