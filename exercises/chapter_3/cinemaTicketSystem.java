import java.util.Scanner;

public class cinemaTicketSystem {
    public static void main(String[] args) {
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
        if     (total == 0) System.out.println("Your total will be FREE");
        else if(total > 0) System.out.println("Your total will be " + total);

        System.out.print("*in a world where you paid, the cashier says* enjoy the movie :)");
    }
}
