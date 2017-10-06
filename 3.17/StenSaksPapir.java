package MikkelSorensen;

import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {

        Scanner pValg = new Scanner(System.in);

        System.out.println("Vælg objekt: Saks(0), Sten(1), Papir(2)."); //Beder brugeren vælge mellem de tre objekter.

        int valg = pValg.nextInt(); // Her indtastet data.

        Random cValg = new Random(); // Computerens valg beregnes.

        int random = cValg.nextInt(3); // Deklarerer at computeren kan vælge mellem 3 tal (0,1,2)

        if (random == valg){
            System.out.println("I valgte det samme; det er uafgjort!"); // Begge vælger det samme, det bliver uafgjort.
        }
        else if (random == 0 && valg == 1){
            System.out.println("Du valgte Sten, computer valgte Saks. Du vandt.");
        }
        else if (random == 1 && valg == 0) {
            System.out.println("Du valgte Saks, computer valgte Sten. Du tabte.");
        }
        else if (random == 1 && valg == 2){
            System.out.println("Du valgte Papir, computer valgte Sten. Du vandt.");
        }
        else if (random == 2 && valg == 1) {
            System.out.println("Du valgte Sten, computer valgte Papir. Du tabte.");
        }
        else if (random == 0 && valg == 2) {
            System.out.println("Du valgte Papir, computer valgte Saks. Du tabte.");
        }
        else if (random == 2 && valg == 0) {
            System.out.println("Du valgte Saks, computer valgte papir. Du vandt. ");
        }
        
    }
}
