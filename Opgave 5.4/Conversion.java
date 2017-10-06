package MikkelSorensen;

public class Conversion {
    public static void main(String[] args) {

        double i; // Deklarerer at variablen er double, da inches er 2.54 cm.

        System.out.println("Inches" + "      Centimeter");
        for (i = 0; i <= 10; i++){          // Loopet kører så længe i ikke er 10
            System.out.println(i + "       " + (i*2.54));   //Som vi har fået af vide, 1 cm = 2.54 inch. 
        }

    }
}
