package MikkelSorensen;

public class Random {
    public static void main(String[] args) {

        int raekke = (int) (Math.random() * 13); // Min random integer, som udregner en random måned mellem 0 og 12.
        System.out.println("Måned: " + raekke); // Printer "Måned: X" i konsollen.

        if (raekke == 1) {                          // Tjekker om det tilfældige tal er 1, hvis det er går boolean
            System.out.println("Måneden er Januar"); // statementen true, og konsollen printer "Måneden er Januar"
        }                                           // Det samme er gældende for alle de andre måneder, bare med andre tal.
        else if (raekke == 2) {
            System.out.println("Måneden er Februar");
        }
        else if (raekke == 3) {
            System.out.println("Måneden er Marts");
        }
        else if (raekke == 4) {
            System.out.println("Måneden er April");
        }
        else if (raekke == 5) {
            System.out.println("Måneden er Maj");
        }
        else if (raekke == 6) {
            System.out.println("Måneden er Juni");
        }
        else if (raekke == 7) {
            System.out.println("Måneden er Juli");
        }
        else if (raekke == 8) {
            System.out.println("Måneden er August");
        }
        else if (raekke == 9) {
            System.out.println("Måneden er September");
        }
        else if (raekke == 10) {
            System.out.println("Måneden er Oktober");
        }
        else if (raekke == 11) {
            System.out.println("Måneden er November");
        }
        else if (raekke == 12) {
            System.out.println("Måneden er November");
        }
        else if (raekke == 0) {
            System.out.println("NYTÅR?!?!?! FEEEEEEEST");
        }

    }
    }
