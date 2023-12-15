import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donner un nombre");
        Scanner sk = new Scanner(System.in);
        double n = sk.nextDouble();
        System.out.println("le carré de : " + n + " est : " +(n*n));

    }
}