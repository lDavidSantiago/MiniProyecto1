import java.util.ArrayList;
public class ArrayObject {
    public static void main (){
        ArrayList<Pet> arrayOfPets = new ArrayList<>();
        arrayOfPets.add(new Pet(false, null, 0));
        arrayOfPets.add(new Pet(false, "Colombia", 15000));
        arrayOfPets.add(new Pet(false, "Colombia", 15000));
        arrayOfPets.add(new Pet(false, "Colombia", 15000));

        for (Pet pet: arrayOfPets) {
            System.out.println("Vacuna: "+pet.vaccine+", Origen"+pet.origin_country+ "Precio "+pet.pet_price);
        }
    }
}
    class Pet {
    boolean vaccine;
    String origin_country;
    float pet_price;


    public Pet(boolean vaccine, String origin_country, float pet_price) {
        this.vaccine = vaccine;
        this.origin_country = origin_country;
        this.pet_price = pet_price;
    }

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
