package MikkelSorensen;

import java.util.Scanner;

public class Gennemsnit {
    public static void main(String[] args) {

        Scanner score = new Scanner(System.in);
        int eScore = 0;
        while (eScore != -1) {
            System.out.println("Indtast din score her");
            eScore = score.nextInt();

            if (eScore < 60){
                System.out.println("You did not pass the examn... git gud scrub ;^) ");
            }
            if (eScore >= 60){
                System.out.println("You passed the examn, congratulations!");
            }
        }


    }
}
