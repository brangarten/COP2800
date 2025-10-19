// I'M GOING TO BLOW UP
// first java thingy bajingy :3

public class assignment01 {
    public static void main(String[] args) {


        //int[] arr = {1, 2, 3};
        String[] stringArr = {"Meow", "Meowww", "!", ":3"}; 
        String meow = "Meow, Meowww! :3";

        System.out.println(meow);
        
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i] == "Meowww") {
                continue;
            }
            System.out.print(stringArr[i] + ' ');
        }

    }
}
