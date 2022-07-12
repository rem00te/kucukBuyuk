import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print(" A SAYISI : ");
        a = input.nextInt();
        System.out.print(" B SAYISI : ");
        b = input.nextInt();
        System.out.print(" C SAYISI : ");
        c = input.nextInt();

        if ((a == b) && (a == c) && (b == c)) {
            System.out.print(" SONUÇ : " + "Tüm sayılar eşit");
        } else if (a < b && a < c) {
            if (b < c) {
                System.out.println(" SONUÇ : " + a + " < " + b + " < " + c );
            } else {
                System.out.println("SONUÇ : " + a +" < " + c +" < " + b );
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("SONUÇ : " + b +" < "+ a + " < " + c);
            } else {
                System.out.println("SONUÇ : " + b +" < " + c + "< " + a );
            }
        } else {
            if (a < c) {
                System.out.println("SONUÇ : " + c + " < " + a + " < " + b );
            } else {
                System.out.println(" SONUÇ : "+ c + " < " + b + " < " + a );
            }
        }

    }
}


