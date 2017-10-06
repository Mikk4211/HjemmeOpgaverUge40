package MikkelSorensen;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner højde = new Scanner(System.in);
        Scanner vægt = new Scanner(System.in);

        System.out.println("Insert height in metres and cm, with a comma seperating them: ");
        double h = højde.nextDouble();
        System.out.println("Insert weight in kg: ");
        double v = vægt.nextDouble();

        double BMI;
        BMI = (v/(h*h));
        System.out.println("Your BMI is: " + BMI);

        if (BMI <= 18.5) {
            System.out.println("You are underweight");
        } else if (BMI <= 25) {
            System.out.println("Your weight is normal");
        } else if (BMI <= 35) {
            System.out.println("You are overweight");
        } else if (BMI <= 40) {
            System.out.println("You are very overweight");
        } else if (BMI >= 40){
            System.out.println("You should probably see a doctor at some point in the near future.");
    }
    }
}
