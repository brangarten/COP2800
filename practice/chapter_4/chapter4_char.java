package practice.chapter_4;

public class chapter4_char {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println(letter);

        // turns to B
        letter++;
        System.out.println(letter);

        // shows ascii dec code
        System.out.println("char to int -> " + (int)letter);

        // manipulate char :P
        System.out.println(Character.toLowerCase(letter));

        int letterCount = 0;
        int digitCount = 0;
        String s = "Haii :3 x3";
        for (int i = 0; i < s.length(); i++) {
            char forChar = s.charAt(i);


            if(Character.isLetter(forChar)) letterCount++;
            if(Character.isDigit(forChar)) digitCount++;
        }
        
        System.out.println("Letters: " + letterCount + "\nDigits: " + digitCount);
    }
}
