import java.util.Scanner;

public class Rekursif {

    private static String recursive(long n){
        String nominal[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

        if (n < 12) return nominal[(int) n];
        else if (n < 20) return nominal[(int)n%10] + " belas";
        else if (n < 100) return nominal[(int)n/10] + " puluh " + nominal[(int)n%10];
        else if (n < 200) return "seratus " + recursive(n%100);
        else if (n < 1000) return nominal[(int)n/100] + " ratus " + recursive(n%100);
        else if (n < 2000) return "seribu " + recursive(n%1000);
        else if (n < 1000000) return recursive((int)n/1000) + " ribu " + recursive(n%1000);
        else if (n < 1000000000) return recursive((int)n/1000000)+ " juta " + recursive(n%1000000);
        else if (n < 1000000000000L) return recursive(n/1000000000)+ " milyar " + recursive(n%1000000000);
        else if (n < 1000000000000000L) return recursive((n/1000000000000L))+ " triliun " + recursive(n%1000000000000L);
        else if (n < 1000000000000000000L) return recursive(n/1000000000000000L)+ " kuadriliun " + recursive(n%1000000000000000L);

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opt;
        do {
            System.out.print("\nMenu\n" +
                    "1. Recursive\n" +
                    "2. Exit\n" +
                    "Option: ");
            opt = scanner.next();
            switch (opt){
                case "1":{
                    System.out.print("Input Nominal (Rp): ");
                    long nominal = scanner.nextLong();
                    System.out.println(recursive(nominal) + " rupiah");
                    break;
                }case "2":{
                    System.out.println("Thank you!");
                    break;
                }default:{
                    System.out.println("Your input was fault");
                }
            }
        }while (!opt.equals("2"));
    }
}