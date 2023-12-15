import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Entre le poid du colis en kg");
        Scanner msk = new Scanner(System.in);
        double poid = msk.nextDouble();
        double frais= 0;
        if (poid<=0){
            frais=0;
        }
        else if ( poid <= 2){
            frais= 5000;
        }
        else if ( poid <= 5){
            frais= 10000;
        }
        else if ( poid <= 10){
            frais= 15000;
        }
        else if ( poid <= 15){
            frais= 20000;
        }
        System.out.println(" les frais d'expedition pour un colis de " + poid + "kg sont de : " +  frais + "GNF" );

    }
}