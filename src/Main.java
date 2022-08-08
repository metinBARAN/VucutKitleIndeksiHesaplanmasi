import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double boy;
        int kilo;

        Scanner log=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu(metre cinsinden) giriniz: ");
        boy=log.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz: ");
        kilo=log.nextInt();

        double vki=kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz: "+vki);
    }
}
