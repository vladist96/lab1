package nmu.belykh.labs.lab3;


public class LabThird {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        SearchMinMax searchMinMax = new SearchMinMax();

        matrix1.setLength(10);
        matrix1.setWidth(10);
        matrix1.getRandom();
        //hell
        searchMinMax.setLength(matrix1.getLength());
        searchMinMax.setWidth(matrix1.getWidth());
        searchMinMax.setMas(matrix1.getMas());
        searchMinMax.getMaximum();
        searchMinMax.getMinimum();

    }
}







