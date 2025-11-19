package review_and_labs.chapter_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class online_store_discount_system {

    public static void main(String[] args) {
        Map<Integer, Membership> memberships = new HashMap<>();
        memberships.put(1, new Membership("Regular", 0f));
        memberships.put(2, new Membership("Silver", .05f));
        memberships.put(3, new Membership("Gold", .10f));
        memberships.put(4, new Membership("Platinum", .20f));
        
        Scanner scan = new Scanner(System.in);
        int userInput;
        double totalPrice;

        System.out.print("Enter your membership: 1, 2, 3, or 4: ");
        userInput = scan.nextInt();

        Membership userMembership = memberships.get(userInput);
        
        System.out.print("Enter total price: ");
        totalPrice = scan.nextDouble();
        
        System.out.println(userMembership.getDiscount());
        System.out.println(userMembership.getMembership());


        double finalPrice = 0;
        double discount;
        switch (userMembership.getMembership()) {
            case "Regular":
                finalPrice = totalPrice;
                break;
            case "Silver":
                if (totalPrice >= 50) {
                    discount =  totalPrice * userMembership.getDiscount();
                    finalPrice = totalPrice - discount;
                } else {
                    finalPrice = totalPrice;
                }
                break;
            case "Gold":

                if (totalPrice >= 100) {
                    userMembership.setDiscount(.15f);
                    discount =  totalPrice * userMembership.getDiscount();
                    finalPrice = totalPrice - discount;
                } else if (totalPrice >= 50) {
                    discount =  totalPrice * userMembership.getDiscount();
                    finalPrice = totalPrice - discount;
                } else {
                    finalPrice = totalPrice;
                }
                break;
            case "Platinum":
                discount =  totalPrice * userMembership.getDiscount();
                finalPrice = totalPrice - discount;
                break;
        }

        scan.close();

        System.out.println("Your final price will be: " + finalPrice);
    }
}