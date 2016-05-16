package com.goeuro.app;

import com.goeuro.model.City;
import com.goeuro.utils.*;

import java.util.List;

/**
 * Solution of JAVA DEVELOPER TEST.
 *
 * You can find the specification test in https://github.com/goeuro/dev-test
 *
 * Created by max on 14/5/16.
 */
public class GoEuroTest {

    public static void main (String[] args)
    {
        // Check how many arguments were passed. Only want one argument!
        if (args.length == 0) {
            System.out.println("Bad use... you must set the city name parameter. Proper use is: java -jar file.jar CityName");
        } else if (args.length != 1) {
            System.out.println("Bad use... too many arguments passed. you must set the city name parameter. Proper use is: java -jar file.jar CityName");
        }

        //  get CSV File
        generateCsvByCity(args[0]);
    }

    /**
     * Method to get all the necessary JSON information to generate CSV file.
     * @param cityName
     */
    private static void generateCsvByCity(String cityName) {
        JsonUtils jsonUtils = new JsonUtils();
        List<City> cityList = jsonUtils.bindCities(cityName);
        String filename = cityName.concat(".csv");
        CsvUtils.writeCSVFile(filename, cityList);
    }
}

