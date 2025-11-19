package practice.chapter_4;
import java.util.Scanner;

public class chapter4_morestrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String escanear;

        double miDoble = 3.14159;
        System.out.printf("%.2f\n", miDoble);

        System.out.print("typo su edad \n> ");
        escanear = scan.nextLine();
        int edad = Integer.parseInt(escanear);

        System.out.printf("Edad es %d", edad);
    }
}
