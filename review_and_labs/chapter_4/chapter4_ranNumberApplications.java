package review_and_labs.chapter_4;
import java.util.Scanner;

public class chapter4_ranNumberApplications {
    public static void main(String[] args) {
        // 8889 + 1000 = 9999
        int code = (int)(Math.random() * 9000) + 1000;
        int guess = 0;
        Scanner scan = new Scanner(System.in);

        do {
            guess = scan.nextInt();
            if (guess < code) {
                System.out.println("Too Low");
            } else if (guess > code) { 
                System.out.println("Too High");
            } else if (guess == code) {
                System.out.println("Correct");
                break;
            }
        } while (true);

        scan.close();
    }
}
