package pro.sky.java.course1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Задание 1.5.
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
        System.out.println(" ");

        //Задание 1.6.
        //задачи с 1-4.
        int[] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        getReverseFullName(reverseFullName);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        sum(arr);
        maxAndMin(arr);
        return arr;
    }

    //задача 1 и 3.
    public static int[] sum(int[] arr) {
        int sum = 0;
        float average = 0f;
        int days = 30;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = (float) sum / days;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        return arr;
    }

    //задача 2.
    public static int[] maxAndMin(int[] arr) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) min = arr[i];
            else if (arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        return arr;
    }

    //задача 4.
    public static char[] getReverseFullName(char[] reverseFullName) {
        int n = reverseFullName.length;
        char temp;

        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        return reverseFullName;
    }
}