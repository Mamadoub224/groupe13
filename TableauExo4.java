import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] t = {4, 6, 9, 8, 7, 8, 12, 4};
        int[] t1 = {4, 77, 9, 88, 7, 8};
        int[] t2 = new int[14];

        System.out.println(" le premier tableau est : ");
        for (int s = 0; s < t.length; s++) {
        }
        System.out.println(Arrays.toString(t));

        System.out.println(" le deuxieme tableau est : ");
        for (int s = 0; s < t1.length; s++) {
        }
        System.out.println(Arrays.toString(t1));


        int val = t.length;
        int val1 = t1.length;
        int i = 0, j = 0, k = 0;
        while (i < val && j < val1) {
            if (t[i] < t1[j]) {
                t2[k++] = t[i++];
            } else {
                t2[k++] = t1[j++];
            }
        }
        while (i < val) {
            t2[k++] = t[i++];
        }
        while (j < val1) {
            t2[k++] = t1[j++];
        }
        System.out.println(" le tableau fusionner est : ");
        for (int s = 0; s < t2.length; s++) {
        }

        System.out.println(Arrays.toString(t2));


        int n = t.length;
        for (int l = 0; l < n - 1; l++) {
            int indicemi = l;
            for (int f = l + 1; f < n; f++) {
                if (t[f] < t[indicemi]) {
                    indicemi = f;
                }
            }
            int h = t[indicemi];
            t[indicemi] = t[l];
            t[l] = h;

        }
        int v = t1.length;
        for (int l = 0; l < v - 1; l++) {
            int indicemi = l;
            for (int f = l + 1; f < v; f++) {
                if (t1[f] < t1[indicemi]) {
                    indicemi = f;
                }
            }
            int h = t1[indicemi];
            t1[indicemi] = t1[l];
            t1[l] = h;
        }
        System.out.println(" le tableau 1 après tri est : ");

        for (int p = 0; p < t.length; p++) {
        }
        System.out.println(Arrays.toString(t));

        System.out.println(" le tableau 2 après tri est : ");

        for (int p = 0; p < t.length; p++) {
        }
        System.out.println(Arrays.toString(t1));


        int y = 0, h = 0, o = 0;
        while (y < n && h < v) {
            if (t[y] < t1[h]) {
                t2[o++] = t[y++];
            } else {
                t2[o++] = t1[h++];
            }
        }
        while (y < n) {
            t2[o++] = t[y++];
        }
        while (h < v) {
            t2[o++] = t1[h++];
        }
        System.out.println(" le tableau fusionner est : ");
        for (int s = 0; s < t2.length; s++) {
        }

        System.out.println(Arrays.toString(t2));


    }
}






