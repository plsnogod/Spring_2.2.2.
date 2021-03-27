package web.model;

public class Car {
    private String country;
    private String carModel;
    private String since;

    public Car(String country, String carModel, String since) {
        this.country = country;
        this.carModel = carModel;
        this.since = since;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }
}
