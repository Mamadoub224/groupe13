public class Main {
    public static void main(String[] args) {
        int[] t = {4, 5, 9, 9, 8, 9, 6};
        if (t == null || t.length <= 1) {
            System.out.println(" il n'a pas de trie néccessaire pour un tableau vide ou d'un seul élémént");
        }
        System.out.println("le tableau avant le trie");
        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "]" + " = " + t[i]);
        }
        int n = t.length;
        for (int i = 0; i < n - 1; i++) {
            int indicemi = i;
            for (int j = i + 1; j < n; j++) {
                if (t[j] < t[indicemi]) {
                    indicemi = j;
                }
            }
            int h = t[indicemi];
            t[indicemi] = t[i];
            t[i] = h;
        }
            System.out.println(" le tableau après le tri");
        for (int i = 0; i < t.length; i++) {
            System.out.println("t[" + i + "]" + " = " + t[i]);
        }
    }
}