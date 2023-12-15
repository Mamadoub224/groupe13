import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Donner l'année ");
        Scanner msk = new Scanner(System.in);
        int a = msk.nextInt();
        if((a%4==0 && a%100!=0) || (a%400==0)){
            System.out.println(" l'année "+a + " est une année bissextiele");
        }
        else{
            System.out.println(" l'année "+a + " n'est pas une année bissextiele" );
        }

    }
}