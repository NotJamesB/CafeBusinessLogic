import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for(int i=1; i < 11; i++){
            sum = sum + i;
        }
        return sum;
    }
    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for (int i = 0; i < lineItems.length; i++) {
            sum = sum += lineItems[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for(String menu : menuItems){
            System.out.println(menu);
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s ", userName);
        System.out.printf("There are %s people in front of you ", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}

