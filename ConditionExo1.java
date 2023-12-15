import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Donner un nombre entier");
        Scanner msk = new Scanner(System.in);
        int nb = msk.nextInt();
        if(nb%2==0){
            System.out.println(" le nombre "+ nb + " est paire");
        }
        else {
            System.out.println(" le nombre " + nb +" est impaire");
        }
    }
}