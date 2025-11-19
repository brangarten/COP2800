package review_and_labs.chapter_4;
import java.util.Scanner;

public class chapter4_temperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter temperature in F \n> ");
        int fahrenheit = scan.nextInt();

        double celsius = (5.0/9.0) * (fahrenheit - 32);

        System.out.printf("Celcius: %.2f fahrenheit %d", celsius, fahrenheit);

        System.out.printf("Celcius: %.2f, its ", celsius);
        
        if(celsius < 0) {
            System.out.print("Below freezing");
        } else if (celsius >= 0 && celsius <= 30) {
            System.out.print("Normal");
        } else if (celsius > 30) {
            System.out.print("Hot");
        }

        scan.close();
    }
}
