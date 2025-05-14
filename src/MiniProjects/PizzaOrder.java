package MiniProjects;

import java.util.Locale;
import java.util.Scanner;

public class PizzaOrder {

    enum PizzaSize {
        SMALL(199),
        MEDIUM(299),
        LARGE(399);

        private final int price;
        int qty;

        // Constructor
        PizzaSize(int price) {
            this.price = price;
        }

//        void setPrice(){
//            price = price* qty;
//        }
        // Method to get price
        public int getPrice() {
            return this.price;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Select your Pizza Size: SMALL, MEDIUM, LARGE ");
        String input = in.next().toUpperCase();

        System.out.println("Enter Quantity e.g. 1, 2 etc");
        int qty = in.nextInt();


        try {
            PizzaSize selectedPizza = PizzaSize.valueOf(input);
            int pizzaPrice = selectedPizza.getPrice();
            int totalAmount = pizzaPrice*qty;
            System.out.println("You Selected for " + selectedPizza + " Size Pizza");

            System.out.println("Price of one pizza is : " + selectedPizza.getPrice());
            System.out.println("Your total amount are: "+totalAmount);

        }catch (IllegalArgumentException e){
            System.out.println("Invalid Input, Please Enter right size");
        }

    }
}


