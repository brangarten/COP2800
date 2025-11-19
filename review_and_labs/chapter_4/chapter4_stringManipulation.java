package review_and_labs.chapter_4;
import java.util.Scanner;

public class chapter4_stringManipulation {
    public static void main(String[] args) {
        int spaceIndex = 0;
        String fullName = "jOhN sMITH";
        char nameChar;


        for (int i = 0; i < fullName.length(); i++) {
            nameChar = fullName.charAt(i);
            if(Character.isWhitespace(nameChar)) {
                spaceIndex = i;
                break;
            }
        }

        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex+1, fullName.length());

        System.out.printf("first name %s \nlast name %s \n", firstName, lastName);

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.printf("first name %s \nlast name %s \n", firstName, lastName);

        fullName = firstName + ' ' + lastName;
        System.out.printf("Full name %s", fullName);


    }
}
