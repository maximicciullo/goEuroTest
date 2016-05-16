import com.goeuro.model.City;
import com.goeuro.model.GeoPosition;
import com.goeuro.utils.CsvUtils;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Suit of test related with CSV Utils.
 *
 * Created by max on 15/5/16.
 */
public class CsvUtilTest {

    @Test
    public void createCsvTest() {
        List<City> cityList = new ArrayList<City>();
        String fileName = "MyCities.csv";

        // Create first City to test.
        City cityBerlin = new City();
        cityBerlin.set_id(new Integer(1234));
        cityBerlin.setName("Berlin");
        cityBerlin.setType("location");
        GeoPosition geoPosBerlin = new GeoPosition();
        geoPosBerlin.setLatitude("52.6798");
        geoPosBerlin.setLongitude("13.58708");
        cityBerlin.setGeo_position(geoPosBerlin);

        // Create second City to test.
        City cityBuenosAires = new City();
        cityBuenosAires.set_id(new Integer(1122));
        cityBuenosAires.setName("Buenos Aires");
        cityBuenosAires.setType("location");
        GeoPosition geoPosBuenosAires = new GeoPosition();
        geoPosBuenosAires.setLatitude("54.1234");
        geoPosBuenosAires.setLongitude("34.55641");
        cityBuenosAires.setGeo_position(geoPosBuenosAires);

        cityList.add(cityBerlin);
        cityList.add(cityBuenosAires);
        assertNotNull(cityList);

        CsvUtils.writeCSVFile(fileName, cityList);
    }
}
