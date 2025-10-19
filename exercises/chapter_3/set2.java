import java.util.Scanner;

public class set2 {

    public static void cinemaSystem() {
        Scanner scan = new Scanner(System.in);

        short age, quantity, dayType;
        float total = 0, multiplier = 0, basePrice = 0;

        System.out.print("Enter age \n> ");
        age = scan.nextShort();

        System.out.print("Enter quantity \n> ");
        quantity = scan.nextShort();

        System.out.print("Enter day (1 - weekday, 2 - weekend, 3 - holiday)\n> ");
        dayType = scan.nextShort();

        scan.close();

        switch(dayType) {
            case 1:
                basePrice = 12;
                break;
            case 2:
                basePrice = 15;
                break;
            case 3:
                basePrice = 10;
                break;
        }
        
        //what da fuck. lisp ass formatting
        //oh well
        if      (age < 5               ) multiplier = 0; 
        else if (age >= 5 || age <= 17 ) multiplier = 0.5f;
        else if (age >= 18 || age <= 64) multiplier = 1f;
        else if (age >= 65             ) multiplier = 0.7f;
    
        total = (float) (basePrice*multiplier*quantity);
        System.out.println("Your total will be " + total);
        System.out.print("*in a world where you paid, the cashier says* enjoy the movie :)");
    }

    public static void groceryDiscountHelper() {
        Scanner scan = new Scanner(System.in);
        short item, pricePerKg = 0;
        float kilograms, discount = 0;

        System.out.print("Enter item (1 - Rice, 2 - Beans, 3 - Sugar)\n> ");
        item = scan.nextShort();

        System.out.print("Enter kg\n> ");
        kilograms = scan.nextFloat();

        switch(item) {
            case 1:
                pricePerKg = 10;
                break;
            case 2:
                pricePerKg = 20;
                break;
            case 3:
                pricePerKg = 30;
                break;
        }

        if      (kilograms <= 5 ) discount = 1f;
        else if (kilograms >= 10) discount = 0.5f;

        float total = pricePerKg * kilograms * (1 - discount);
        System.out.println(total);

        scan.close();
    }

    public static void retailTaxCalculator() {
        Scanner scan = new Scanner(System.in);
        short region;
        float price = 0, taxRate = 0, surCharge = 1, total;

        System.out.print("Select Region (1 - Low, 2 - Medium, 3 - High)\n> ");
        region = scan.nextShort();
        
        scan.close();
        switch(region) {
            case 1:
                taxRate = 0.05f;
                break;
            case 2:
                taxRate = 0.10f;
                break;
            case 3:
                taxRate = 0.15f;
                break;
        }

        if(price > 500) surCharge = 0.02f;
        total = price + (price * taxRate) + (price * surCharge);

        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("Pick your method:"  +
                                "\n1. Cinema Ticket System" + 
                                "\n2. Grocery Discount Helper"  +
                                "\n3. Retail Tax Calculator" +
                                "\nPress Any key to quit");
            int userInput = scan.nextInt();
            scan.close();
            switch (userInput) {
                case 1:
                    cinemaSystem();
                    break;
                case 2:
                    groceryDiscountHelper();
                    break;
                case 3:
                    retailTaxCalculator();
                    break;
            }
        }
        scan.close();
    }
}
