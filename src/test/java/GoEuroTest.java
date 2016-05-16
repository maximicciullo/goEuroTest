import com.goeuro.model.City;
import com.goeuro.utils.CsvUtils;
import com.goeuro.utils.JsonUtils;
import org.junit.Test;

import java.util.List;

/**
 * Test of full solution problem.
 *
 * Created by max on 16/5/16.
 */
public class GoEuroTest {

    /**
     * Test of full application witout param value in command line.
     * That param is just created as defined string (Berlin).
     * Expected result: Berlin.csv file
     */
    @Test
    public void generateCsvByCity() {
        String cityName = "Berlin";
        JsonUtils jsonUtils = new JsonUtils();
        List<City> cityList = jsonUtils.bindCities(cityName);
        String filename = cityName.concat(".csv");
        CsvUtils.writeCSVFile(filename, cityList);
    }

}
