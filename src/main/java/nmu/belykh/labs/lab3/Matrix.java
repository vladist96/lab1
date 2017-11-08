package nmu.belykh.labs.lab3;

import java.util.Random;

public class Matrix {
    private int lengthMatrix;
    private int widthMatrix;
    private int[][] mas = new int[1000][1000];

    public void setLength(int lengthMatrix) {
        this.lengthMatrix = lengthMatrix;
    }

    public void setWidth(int widthMatrix) {
        this.widthMatrix = widthMatrix;
    }

    public int getLength() {
        return lengthMatrix;
    }

    public int getWidth() {
        return widthMatrix;
    }

    public int[][] getMas() {
        return mas;
    }

    public void getRandom() {
        Random rand = new Random();

        for (int i = 0; i < lengthMatrix; i++) {
            for (int j = 0; j < widthMatrix; j++) {
                mas[i][j] = rand.nextInt(1000) - 300;
            }
        }

        for (int i = 0; i < lengthMatrix; i++) {
            for (int j = 0; j < widthMatrix; j++) {
                System.out.print(mas[i][j] + "  ");
            }

            System.out.println();
        }
    }

}
