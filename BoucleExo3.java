import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donner un nombre pour voir sa table de multiplication par 10 ");
        Scanner msk = new Scanner(System.in);
        int nb = msk.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(nb+ " * " + i + " = " + nb*i);
        }
    }
}