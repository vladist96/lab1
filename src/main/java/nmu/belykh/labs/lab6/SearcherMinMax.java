package nmu.belykh.labs.lab6;

import java.util.List;

public class SearcherMinMax {
    private int lengthMatrix;
    private int widthMatrix;

    public void setWidth(Matrix matrix) {
        this.widthMatrix = matrix.getWidth();
    }

    public void setLength(Matrix matrix) {
        this.lengthMatrix = matrix.getLength();
    }

    public int getMaximum(Matrix matrix) {
        int max = matrix.getRandomMatrix().get(0).get(0);
        lengthMatrix= matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getRandomMatrix()) {
            for (Integer num : lists) {
                if (max < num)
                    max = num;
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public int getMinimum(Matrix matrix) {
        int min = matrix.getRandomMatrix().get(0).get(0);
        lengthMatrix= matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getRandomMatrix()) {
            for (Integer num : lists) {
                if (min > num)
                    min = num;
            }
        }
        System.out.println("Min: " + min);
        return min;
    }
}
