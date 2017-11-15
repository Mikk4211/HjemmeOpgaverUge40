/* Lavet af Mikkel Sørensen
Mikk4211@edu.easj.dk
EASJ Næstved, DAT 1 */

package MikkelSorensen;

import java.util.Scanner;

public class Gennemsnit {
    public static void main(String[] args) {
        
        //Scanner til indtastning af din eksamenscore
        Scanner score = new Scanner(System.in);
        int eScore = 0;
        while (eScore != -1) {
            System.out.println("Indtast din score her");
            eScore = score.nextInt();
            
            //Hvis din score er under 60, består du ikke - er den over består du. 
            if (eScore < 60){
                System.out.println("You did not pass the examn... git gud scrub ;^) ");
            }
            if (eScore >= 60){
                System.out.println("You passed the examn, congratulations!");
            }
        }


    }
}
