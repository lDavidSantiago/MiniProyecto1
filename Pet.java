public class Pet {
    private boolean vaccine;
    private String origin_country;
    private float pet_price;

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public float getPet_price() {
        return pet_price;
    }

    public void setPet_price(float pet_price) {
        this.pet_price = pet_price;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

}
