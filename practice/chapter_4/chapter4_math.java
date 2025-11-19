package practice.chapter_4;
import java.lang.Math;
import java.util.Scanner;

public class chapter4_math {
    public static void main(String[] args) {
        int six_sided_die = (int)(Math.random() * 6) + 1;
        System.out.println("Die roll: " + six_sided_die);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Only perfect squares because idgaf\n> ");
        int n = scan.nextInt();

        n = (int)Math.sqrt(n);
        System.out.println("square root of n is " + n);
        System.out.println("n (" + n + ") square is " + (int)Math.pow(n, 2));

        System.out.print("Distance from 0\n> ");
        int value = scan.nextInt();
        value = Math.abs(value);

        System.out.println("Distance from 0 is " + value);

        scan.close();
    }
}
