package practice.chapter_4;
import java.util.Scanner;

public class chapter4_strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "Bran";
        System.out.println("Length: " + name.length());
        
        int index = 0;
        do {
        System.out.println("Select index: 1-" + name.length());
        
        // Name is 4. if we checkup it has to be 0-3. so subtract from input.
        index = scan.nextInt();
        index--;
        if (index >= 0 && index <= name.length()-1) {
            System.out.println("Char at " + (index+1) + " is " + name.charAt(index));
            break;
        }
        } while (true);

        String last = "Jergandee";
        String fullName = name;
        
        // these both are the same thing
        fullName = name + last;
        fullName = fullName.concat(last);
    
        System.out.println(fullName);
        
        String subName = fullName.substring(2, 8);
        System.out.println(subName);

        scan.close();
    }
}
