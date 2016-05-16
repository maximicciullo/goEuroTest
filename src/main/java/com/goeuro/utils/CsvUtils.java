package com.goeuro.utils;

import com.goeuro.model.City;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Common utils to work with CSV files.
 *
 * Created by max on 14/5/16.
 */
public class CsvUtils {

    private static final String COMMA_DELIMITER = ";";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // Header CSV File
    private static final String FILE_HEADER = "_id; name; type; latitude; longitude";

    public static void writeCSVFile(String fileName, List<City> cityList)  {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            // Iterate each City and write each row of the csv file.
            for (City city : cityList) {
                fileWriter.append(String.valueOf(city.get_id()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(city.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(city.getType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(city.getGeo_position().getLatitude());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(city.getGeo_position().getLongitude());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
