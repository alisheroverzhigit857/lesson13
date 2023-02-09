public class Klaviatura {
   private  String light ;
   private String dpklavisha ;

    public Klaviatura(String light, String dpklavisha) {
        this.light = light;
        this.dpklavisha = dpklavisha;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getDpklavisha() {
        return dpklavisha;
    }

    public void setDpklavisha(String dpklavisha) {
        this.dpklavisha = dpklavisha;
    }

    @Override
    public String toString() {
        return "Klaviatura{" +
                "light='" + light + '\'' +
                ", dpklavisha='" + dpklavisha + '\'' +
                '}';
    }
}
