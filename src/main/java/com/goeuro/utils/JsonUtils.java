package com.goeuro.utils;

import com.goeuro.model.City;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Common Utils to work with JSON objects.
 *
 * Created by max on 14/5/16.
 */
public class JsonUtils {

    // Necessary url to hit in test.
    private static String URL = "http://api.goeuro.com/api/v2/position/suggest/en/";

    public List<City> bindCities(String cityName) {
        // Is necessary to execute cause there're problems with java 1.7
        System.setProperty("jsse.enableSNIExtension", "false");

        ObjectMapper mapper = new ObjectMapper();
        List<City> cityList = null;
        try {
             cityList = mapper.readValue(new URL(URL.concat(cityName)), new TypeReference<List<City>>(){});
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityList;
    }
}
