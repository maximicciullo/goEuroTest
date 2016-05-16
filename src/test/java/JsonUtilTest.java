import com.goeuro.model.City;
import com.goeuro.utils.JsonUtils;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

/**
 * Suit of tests related witht Json Utils.
 *
 * Created by max on 15/5/16.
 */
public class JsonUtilTest {

    @Test
    public void testBindJackson() {
        String cityName = "Berlin";
        JsonUtils jsonUtils = new JsonUtils();
        List<City> cityList = jsonUtils.bindCities(cityName);
        assertNotNull(cityList);
    }
}
