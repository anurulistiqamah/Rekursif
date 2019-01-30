import java.math.BigInteger;
import java.util.Scanner;

public class RekursifBigInteger {

    private static String recursive(BigInteger n){
        String nominal[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

        BigInteger ratus = new BigInteger("100");
        BigInteger ribu = new BigInteger("1000");
        BigInteger juta = new BigInteger("1000000");
        BigInteger milyar = new BigInteger("1000000000");
        BigInteger triliun = new BigInteger("1000000000000");
        BigInteger kuadriliun = new BigInteger("1000000000000000");
        BigInteger kuantiliun = new BigInteger("1000000000000000000");
        BigInteger sekstiliun = new BigInteger("1000000000000000000000");
        BigInteger oktiliun = new BigInteger("1000000000000000000000000");
        BigInteger noniliun = new BigInteger("1000000000000000000000000000");
        BigInteger desiliun = new BigInteger("1000000000000000000000000000000");
        BigInteger kilodesiliun = new BigInteger("1000000000000000000000000000000000");

        if (n.compareTo(new BigInteger("12")) == -1) return nominal[n.intValue()];
        else if (n.compareTo(new BigInteger("20")) == -1) return nominal[n.intValue()%10] + " belas";
        else if (n.compareTo(ratus) == -1) return nominal[n.intValue()/10] + " puluh " + nominal[n.intValue()%10];
        else if (n.compareTo(new BigInteger("200")) == -1) return "seratus " + recursive(n.mod(ratus));
        else if (n.compareTo(ribu) == -1) return nominal[n.intValue()/100] + " ratus " + recursive(n.mod(ratus));
        else if (n.compareTo(new BigInteger("2000")) == -1) return "seribu " + recursive(n.mod(ribu));
        else if (n.compareTo(juta) == -1) return recursive(n.divide(ribu)) + " ribu " + recursive(n.mod(ribu));
        else if (n.compareTo(milyar) == -1) return recursive(n.divide(juta))+ " juta " + recursive(n.mod(juta));
        else if (n.compareTo(triliun) == -1) return recursive(n.divide(milyar))+ " milyar " + recursive(n.mod(milyar));
        else if (n.compareTo(kuadriliun) == -1) return recursive((n.divide(triliun)))+ " triliun " + recursive(n.mod(triliun));
        else if (n.compareTo(kuantiliun) == -1) return recursive(n.divide(kuadriliun))+ " kuadriliun " + recursive(n.mod(kuadriliun));
        else if (n.compareTo(sekstiliun) == -1) return recursive(n.divide(kuantiliun))+ " kuantiliun " + recursive(n.mod(kuantiliun));
        else if (n.compareTo(oktiliun) == -1) return recursive(n.divide(sekstiliun))+ " sekstiliun " + recursive(n.mod(sekstiliun));
        else if (n.compareTo(noniliun) == -1) return recursive(n.divide(oktiliun))+ " oktiliun " + recursive(n.mod(oktiliun));
        else if (n.compareTo(desiliun) == -1) return recursive(n.divide(noniliun))+ " noniliun " + recursive(n.mod(noniliun));
        else if (n.compareTo(kilodesiliun) == -1) return recursive(n.divide(desiliun))+ " desiliun " + recursive(n.mod(desiliun));

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
                    BigInteger nominal = scanner.nextBigInteger();
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