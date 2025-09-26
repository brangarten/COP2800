import java.util.Scanner;


public class ComputeArea {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        double radius, area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Radius: ");
        radius = scan.nextInt();

        /* 
        System.out.print("Enter radius, again.");
        radius = scan.nextDouble();
        */
        
        scan.close();

        area = PI * Math.pow(radius, 2);

        System.out.println("The area to the circle is " + area);
    }
}
