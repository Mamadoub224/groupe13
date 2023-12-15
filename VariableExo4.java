import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" choisisez l'unité de la temperature (C pour celsius, F ppour fahrenheit):");
        Scanner skm = new Scanner(System.in);
        char unite = skm.next().charAt(0);
        System.out.println("Donner la temperature : ");
        double T = skm.nextDouble();
        double R = (unite == 'C')?(T*9/5)+32:(T-32)*5/9;
        System.out.println(T+"°"+unite+ " équivaut à "+R +"°"+((unite=='C')?'F':'C'));


    }
}