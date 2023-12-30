import java.util.Scanner;

public class KvadratDvaBroja {
    public static void main(String[] args) {
        System.out.println("Unesite broj koji želite kvadrirati: ");
        float kvadrat = new Scanner(System.in).nextFloat();
        float rezultat = kvadrat * kvadrat;
        System.out.println("Kvadrat broja " + kvadrat + " iznosi: " + rezultat);

        /**
         * Druga metoda
         */
        System.out.println("Unesite broj koji želite kvadrirati: ");
        float kvadrat1 = new Scanner(System.in).nextFloat();

        System.out.println("Kvadrat broja " + kvadrat1 + " = " + Math.pow(kvadrat1, 2));

   
    }
}
