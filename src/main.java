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
                System.out.println(" SONUÇ : " + "A :" + a + " < " + "B :"+ b + " < "+ "C :" + c );
            } else {
                System.out.println("SONUÇ : " + "A :" + a +" < " + "C :" + c +" < " + "B :" + b );
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("SONUÇ : " + "B :" + b +" < "+ "A :" + a + " < " + "C :" + c);
            } else {
                System.out.println("SONUÇ : " +"B :" + b +" < " + "C :" + c + "< "+ "A :" + a );
            }
        } else {
            if (a < c) {
                System.out.println("SONUÇ : " + "C :" + c + " < "+ "A :" + a + " < " + "B :" + b );
            } else {
                System.out.println(" SONUÇ : "+ "C :" + c + " < " +"B :" + b + " < "+ "A :" + a );
            }
        }

    }
}


