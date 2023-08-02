package pelmeni;

import java.util.Random;

public class Pelmen {
    public static void main(String[] args) {

        int[] p = new int[10];
        Random rand = new Random();
        boolean f = false;
        for (int i = 0; i < p.length; i++) {
            p[i] = rand.nextInt(10) + 1;
            if (p[i] == 5) {
                System.out.println("Счастливое число номер с индексом " + i);
                f = true;
            }
        }
        if (f == false)
            System.out.println("Нет счастливого числа");
        for (int j : p) {
            System.out.print(j + " ");
        }

    }
}
