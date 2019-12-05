package earthquakes.searches;

public class EqSearch{

    private int distance;
    private int minmag;
    private double lat, lon;
    private String location;


    public EqSearch(){
        distance = 0;
        minmag = 0;
    }

    public void setDistance(int x){
        distance = x;
    }

    public void setMinmag(int x){
        minmag = x;
    }

    public void setLat(double x){
        lat = x;
    }

    public void setLon(double x){
        lon = x;
    }

    public void setLocation(String x){
        location = x;
    }


    public int getDistance(){
        return distance;
    }

    public int getMinmag(){
        return minmag;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }

    public String getLocation(){
        return location;
    }

}