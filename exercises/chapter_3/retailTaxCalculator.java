import java.util.Scanner;

public class retailTaxCalculator {
    public static void main(String[] args) {
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

        if(price > 500) surCharge = 0.02f;
        total = price + (price * taxRate) + (price * surCharge);

        System.out.println(total);
    }
}
