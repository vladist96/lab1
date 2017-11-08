package nmu.belykh.labs.lab1;

public class LabOne {
    public static void main(String[] args) {
        saySmth(sub(3,9));
        saySmth(sub(9,3));

    }

    private static void saySmth(int s) {
        System.out.println(s);
    }

    private static int sub(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue - secondValue;
        } else {
            return secondValue - firstValue;
        }
    }

}
