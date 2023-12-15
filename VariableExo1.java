import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donner les deux nombres");
        Scanner saisie = new Scanner(System.in);
        double nb = saisie.nextDouble();
        double nb1 = saisie.nextDouble();
        System.out.println("les nombres avant l'echange est : "  + nb +" et " + nb1);
        nb= nb + nb1;
        nb1= nb - nb1;
        nb= nb - nb1;
        System.out.println("les nombres après l'echange est : "  + nb +" et " + nb1);
    }





    }
