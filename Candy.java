import com.company.DesertShop;

public class Candy extends DesertShop {
    int totalCandies = 400;
    int price = 50;

    public void addItem(int number) {
        totalCandies = totalCandies + number;
        System.out.println("total cookies int the store =" + totalCandies);
    }

    //override
    public void getCost(int number) {
        cost = number * price;
        totalcost = cost + tax * number;
        System.out.println("the cost of " + number + "Candies is " + number + "*" + price + "=" + cost);
        System.out.println("Tax is : " + (tax * number) + "\nTotalcost is : " + totalcost);
    }
 }
