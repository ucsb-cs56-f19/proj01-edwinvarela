package earthquakes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String placeId;
    private String name;
    private double latitude;
    private double longitude;
    private String uid;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPlaceId() { return placeId; }
    public void setPlaceId(String x) { this.placeId = x; }
   
    public String getName() { return name; }
    public void setName (String x) { this.name = x; }

    public double getLatitude() { return latitude; }
    public void setLatitude (double x) { this.latitude = x; }

    public double getLongitude() { return longitude; }
    public void setLongitude (double x) { this.longitude = x; }

    public String getUid() { return uid; }
    public void setUid (String x) { this.uid = x; }

}
