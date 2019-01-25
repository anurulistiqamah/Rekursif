import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m;

        m = n % 10;
        n = n / 1000000000;

        System.out.println(n);
        System.out.println(m);
    }
}
