import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] t = {4, 8, 9, 6, 7, 9, 9, 9, 9, 9, 9, 8, 8, 8};
        int cpt = 0;
        int s = 0;
        System.out.println(" Donner un nombre");
        Scanner msk = new Scanner(System.in);
        int nb = msk.nextInt();
        for (int i = 0; i < t.length; i++) {
            if (nb == t[i]) {
                cpt++;
            }
        }
        if (cpt == 0) {

            System.out.println(" le nombre n'existe pas dans le tableau");
        } else {

            System.out.println(" le nombre  " + nb + " existe " + cpt + "  fois dans le tableau");
        }
    }
}
