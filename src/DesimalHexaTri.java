import java.util.Scanner;

public class DesimalHexaTri {

    //decimal to hexatridecimal
    private static String dectohexatri(long x){
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int base = 36;
        String hextri = "";
        while (x != 0){
            long digit = x % base;
            hextri = digits.charAt((int) digit) + hextri;
            x = x/base;
        }
        return hextri;
    }

    //hexatridecimal to decimal
    private static long hextritodec(String x){
        long dec = Long.parseLong(x, 36);
        return dec;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opt;

        do{
            System.out.print("\nMenu:\n" +
                    "1. Decimal to Hexatridecimal\n" +
                    "2. Hexatridecimal to Decimal\n" +
                    "3. Exit\n" +
                    "Pilihan: ");
            opt = scan.next();
            switch (opt){
                case "1":{
                    System.out.print("Input Decimal: ");
                    long dec = scan.nextLong();
                    System.out.println("Output Base36: " + dectohexatri(dec));
                    break;
                }case "2": {
                    System.out.print("Input Base36: ");
                    String hexa = scan.next();
                    System.out.println("Output Decimal: " + hextritodec(hexa));
                    break;
                }case "3":{
                    System.out.println("Thank you!");
                    break;
                }default:{
                    System.out.println("Your input was fault");
                }
            }
        }while (!opt.equals("3"));
    }
}
