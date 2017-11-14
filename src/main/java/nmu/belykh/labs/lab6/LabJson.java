package nmu.belykh.labs.lab6;

import com.google.gson.*;
import java.io.*;
import java.util.Objects;
import java.util.logging.*;

public class LabJson {
    private static final String FILENAME = "d:\\labJson.json";

    public static void main(String[] args) {
        Author author = new Author("Steve", 21, Author.Sex.valueOf("male"));
        Matrix matrix = new Matrix(author);
        SearcherMinMax minMax = new SearcherMinMax();

        matrix.setLength(4);
        matrix.setWidth(4);
        System.out.println("Name: " + matrix.getName() +
                "\nAge: " + matrix.getAge() +
                "\nSex: " + matrix.getSex());

        matrix.getRandomMatrix();
        matrix.printMatrix();
        minMax.getMaximum(matrix);
        minMax.getMinimum(matrix);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String toFileJson = gson.toJson(matrix);
        String fromFileJson = null;
        try (FileWriter fileWriter = new FileWriter(FILENAME)) {
            fileWriter.write(toFileJson);
        } catch (IOException ex) {
            Logger.getLogger(LabJson.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(FILENAME));
            fromFileJson = org.apache.commons.io.IOUtils.toString(reader);

        } catch (IOException ex) {
            Logger.getLogger(LabJson.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
/*
        System.out.println(toFileJson);
        System.out.println(fromFileJson);
*/
        if (Objects.equals(toFileJson, fromFileJson)) {
            System.out.println("\nHurrah!!! \nVariables are equal!!!");
        } else System.out.println("\nOops something went wrong! :/");
    }
}
