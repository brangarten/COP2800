import java.util.Scanner;

public class set1 {

    static void checkNum(int n) {
        if(n < 0) {
            System.out.println(-1);
        } else if (n == 0) {
            System.out.println(0);
        } else if (n > 0) {
            System.out.println(1);
        }
    }

    static void evenOrOdd(int n) {
        if(n % 2 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    static void compareNums(int a, int b) {
        if (a > b) {
            System.out.println(1);
        } else if (a == b) {
            System.out.println(0);
        } else if (a < b) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean running = true;
        int num1, num2;

        while (running) {
            System.out.println("Pick your method:"  +
                                "\n1. Check Number" + 
                                "\n2. Even or Odd"  +
                                "\n3. Compare Numbers" +
                                "\nPress Any key to quit");
            int userInput = scan.nextInt();
            
            switch (userInput) {
                case 1:
                    System.out.print("Enter number: ");
                    num1 = scan.nextInt();
                    
                    checkNum(num1);

                    try {
                        Thread.sleep(1250);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();;
                    }

                    break;
                
                case 2:
                    System.out.print("Enter number: ");
                    num1 = scan.nextInt();
                    
                    evenOrOdd(num1);

                    try {
                        Thread.sleep(1250);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();;
                    }

                    break;
    
                case 3:
                    System.out.print("Enter numbers: ");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    
                    compareNums(num1, num2);

                    try {
                        Thread.sleep(1250);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();;
                    }

                    break;
            }
        }
        scan.close();
    }
}
