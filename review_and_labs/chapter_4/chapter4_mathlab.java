package review_and_labs.chapter_4;
import java.util.Scanner;

public class chapter4_mathlab {
    public static void main(String[] args) {
        final double PI = Math.PI;
        // Area = pi*r^2
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius to find area \n> ");
        int radius = scan.nextInt();

        double area = PI * Math.pow(radius, 2);
        double circumference = 2 * PI * radius;
        System.out.printf("Area: %.2f \nCircumference: %.2f \nRadius: %d", area, circumference, radius);
    
        scan.close();
    }
}
