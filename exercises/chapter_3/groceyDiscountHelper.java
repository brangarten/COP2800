import java.util.Scanner;

public class groceyDiscountHelper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short item, pricePerKg = 0;
        float kilograms, discount = 0;

        System.out.print("Enter item (1 - Rice, 2 - Beans, 3 - Sugar)\n> ");
        item = scan.nextShort();

        System.out.print("Enter kg\n> ");
        kilograms = scan.nextFloat();

        switch(item) {
            case 1:
                pricePerKg = 20;
                break;
            case 2:
                pricePerKg = 30;
                break;
            case 3:
                pricePerKg = 40;
                break;
        }

        if      (kilograms <= 5 ) discount = 1f;
        else if (kilograms >= 10) discount = 0.5f;

        float total = pricePerKg * kilograms * (1 - discount);
        System.out.println(total);

        scan.close();
    }
}
