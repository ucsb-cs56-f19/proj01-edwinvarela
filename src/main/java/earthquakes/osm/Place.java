package earthquakes.osm;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.core.type.TypeReference<T>;

public class Place {
    public long place_id;
    public String display_name, type;
    public double lat, lon;

    private static Logger logger = LoggerFactory.getLogger(Place.class); 

    public static List<Place> listFromJson(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


            List<Place> place = objectMapper.readValue(json, new TypeReference<List<Place>>(){});
            return place;


        } catch (JsonProcessingException jpe) {
            logger.error("JsonProcessingException:" + jpe);
            return null;
        } catch (Exception e) {
            logger.error("Exception:" + e);
            return null;
        }
    }
}


 
