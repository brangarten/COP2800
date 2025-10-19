public class XOR_Swap {
    public static void main(String[] args) {
        int a = 14, b = 13;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        a = a ^ b;
        b = a ^ b;

    }
    
}
