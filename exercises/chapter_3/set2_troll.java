import java.util.Scanner;

public class set2_troll {

    public static void pauseThread(float n) {
        long duration = (long) (n * 1000);
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            Thread.currentThread().interrupt();
        }    
    }

    public static void charByChar(String string, float duration) {
        //myString.charAt(2)

        for (int i = 0; i < string.length(); i++) {
            char thisChar = string.charAt(i);
            System.out.print(thisChar);
            pauseThread(duration);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short age, quantity, dayType;

        System.out.print("Cashier:");
        charByChar(" Welcome to the Movie Theaters! Where we have the best food, arcade, and special moments ifykwim *winkwink*", 0.03f);

        System.out.print("\nCustomer: ");
        pauseThread(1);
        charByChar("...", 0.05f);

        System.out.print("\nCashier: ");
        charByChar("Anyways...", 0.5f);
        charByChar(" How old are you?\n> ", 0.05f);

        age = scan.nextShort();

        System.out.println();

        scan.close();

    }
}
