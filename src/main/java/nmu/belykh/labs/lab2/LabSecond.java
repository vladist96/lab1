package nmu.belykh.labs.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LabSecond {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] mas = new int[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                mas[i][j] = rand.nextInt(1000) - 300;
            } //рандом на 10 000 число [- 700;300]
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(mas[i][j] + "  ");
            }

            //if ((i+1)%100 == 0) {
                System.out.println(); //скидываем на новую строку, каждые 10 элементов

        }   //вывод массива из 10 000 числа

        int max = getMaximum(mas);
        int min = getMinimum(mas);

        System.out.println();
        System.out.println("Maxmimum: " + max);
        System.out.println("Minimum: " + min);
    }

    static int getMaximum(int[][] getMas) {
        int getMax = getMas[0][0];
        for (int i = 0; i < getMas.length; i++) {
            for (int j = 0; j < getMas.length; j++)
                if (getMax < getMas[i][j])
                    getMax = getMas[i][j];
        }
        return getMax;
    }

    static int getMinimum(int[][] gMas) {
        int getMin = gMas[0][0];
        for (int i = 0; i < gMas.length; i++) {
            for (int j = 0; j < gMas.length; j++)
                if (getMin > gMas[i][j])
                    getMin = gMas[i][j];
        }
        return getMin;
    }
}

