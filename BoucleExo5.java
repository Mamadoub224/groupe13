import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int nb_deviner = 10;
        Scanner msk = new Scanner(System.in);
        int choix;
        do {
            System.out.println(" Deviner un nombre ");
            choix = msk.nextInt();
            if (choix != nb_deviner) {
                System.out.println(" mauvais choix ");
                if (choix < 10) {
                    System.out.println(" vous êtes presque chossisez un nombre plus grand ");
                } else {
                    System.out.println(" vous êtes presque chossisez un nombre plus petit ");
                }

            }
        } while (choix != nb_deviner);
        System.out.println("Bravo!");
    }
}