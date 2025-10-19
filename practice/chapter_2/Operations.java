public class Operations {
    public static void main(String[] args) {
        System.out.println(2%1);

        /*
        The result of this is 1. That is because n^0 = 1. At first glance you think it'd be sqrt(4)^1.
        The reason that isn't the case is because in Java 1/2 results in 0 because of integer division.
        The only reason to avoid this, is if 1/2 would be rewritten as a float -> 1.0/2.0
        */
        System.out.println("4^1/2 INT   = "+ Math.pow(4,1/2));

        System.out.println("4^1/2 FLOAT = "+ Math.pow(4,1.0/2.0));

        // 2.12.1

        // x = 4/3*(r+34) - 9*(a+b*c) + 3+d*(2+a)/a+b*d
    }
}
