package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        // задание 1.
        int[] i = new int[]{1, 2, 3};
        float[] f = {1.57f, 7.654f, 9.986f};
        boolean[] b = {true, true, false};
        // задание 2.
        for (int j = 0; j < i.length; j++) {
            if (j < (i.length - 1)) {
                System.out.print(i[j] + ", ");
            } else System.out.println(i[j]);
        }

        for (int k = 0; k < f.length; k++) {
            if (k < (f.length - 1)) {
                System.out.print(f[k] + ", ");
            } else System.out.println(f[k]);
        }

        for (int n = 0; n < b.length; n++) {
            if (n < (b.length - 1)) {
                System.out.print(b[n] + ", ");
            } else System.out.println(b[n]);
        }

        // задание 3.
        for (int j1 = i.length; j1 != 0; j1--) {
            if (j1 > 1) {
                System.out.print(i[j1 - 1] + ", ");
            } else System.out.println(i[j1 - 1]);
        }

        for (int k1 = f.length; k1 != 0; k1--) {
            if (k1 > 1) {
                System.out.print(f[k1 - 1] + ", ");
            } else System.out.println(f[k1 - 1]);
        }

        for (int n1 = b.length; n1 != 0; n1--) {
            if (n1 > 1) {
                System.out.print(b[n1 - 1] + ", ");
            } else System.out.println(b[n1 - 1]);
        }

        // задание 4.
        int x = i.length;
        for (int s = 0; s < i.length; s++) {
            if (i[s] % 2 != 0) {
                i[s] = i[s] + 1;
            }
            System.out.print(i[s] + " ");
        }
    }
}