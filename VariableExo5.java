import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donner trois nombres");
        Scanner msk = new Scanner(System.in);
        double m1 = msk.nextDouble();
        double m2 = msk.nextDouble();
        double m3 = msk.nextDouble();
        double moy= ((m1+m2+m3)/3);
        System.out.println(" la moyenne de : "+m1 + "," +m2+ "et" +m3+" est : "+moy);
    }
}