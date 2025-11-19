package review_and_labs.chapter_4;
import java.util.Scanner;

public class chapter4_checkCharacter {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter char \n> ");
        String userInput = scan.nextLine();
        char localChar = userInput.charAt(0);

        if(Character.isLetter(localChar)) {
            System.out.println("It's a character");
        } else if (Character.isDigit(localChar)) {
            System.out.println("It's a digit");
        } else {
            System.out.println("It's something...");
        }
    }
}
