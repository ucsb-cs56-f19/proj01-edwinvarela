package hello.searches;

public class EqSearch{

    private int distance;
    private int minmag;

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

    public int getDistance(){
        return distance;
    }

    public int getMinmag(){
        return minmag;
    }
}