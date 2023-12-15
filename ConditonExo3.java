import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Donner trois nombres");
        Scanner msd = new Scanner(System.in);
        double a= msd.nextDouble();
        double b= msd.nextDouble();
        double c= msd.nextDouble();
        double max=(a<b)?((b<c)?c:b):((a<c)?c:a);
        System.out.println(" le plus grands de " + a +"," +b +  "et" +c + "est : "+ max);

    }
}