import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("donner la longuer et la largeur");
        Scanner saisie = new Scanner(System.in);
        double L = saisie.nextDouble();
        double l = saisie.nextDouble();
        if (L>l){
            double s= l*L;
            System.out.println("la surface du rectangle avec une longuer de "+L + "et une largeur de " +l + "  est : " +s);
        }
        else{
            System.out.println("la longeur doit être superieur à la largeur du rectangle");
        }

    }
}