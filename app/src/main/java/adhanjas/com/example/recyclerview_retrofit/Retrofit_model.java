package adhanjas.com.example.recyclerview_retrofit;

public class Retrofit_model {
    private String name,hours,country,badge_Url;

    public Retrofit_model(String name, String hours, String country, String badge_Url) {
        this.name = name;
        this.hours = hours;
        this.country = country;
        this.badge_Url = badge_Url;}

    public String getName() {
        return name;}

    public void setName(String name) {this.name = name;}

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBadge_Url() {
        return badge_Url;
    }

    public void setBadge_Url(String badge_Url) {
        this.badge_Url = badge_Url;}

    @Override
    public String toString() {
        return "Retrofit_model{" +
                "name='" + name + '\'' +
                ", hours='" + hours + '\'' +
                ", country='" + country + '\'' +
                ", badge_Url='" + badge_Url + '\'' +
                '}';
    }
}
