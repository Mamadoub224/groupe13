import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Donner votre âge ");
        Scanner msk = new Scanner(System.in);
        int age = msk.nextInt();
        if(age>=18){
            System.out.println(" vous êtes majeur");
        }
        else {
            System.out.println(" vous êtes mineur");
        }
    }
}