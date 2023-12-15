import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donner un nombre pour sa factorielle");
        Scanner msk = new Scanner(System.in);
        long f = msk.nextInt();
        long resulta = 1;
        if(f <0){
            System.out.println("la factorielle est definie que pour les nombres positifs");
        }
        else {

            int i=1;

            do {
                resulta *=i;
                i++;
            } while (i<=f);
            System.out.println(" la factorielle de  " +f+"!  est :" +resulta);
        }

    }
}