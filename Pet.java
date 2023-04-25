import java.util.Scanner;

public class Pet {
    private boolean vaccine;
    private String origin_country;
    private float pet_price;
    public int[] ArregloMascotas;
    Scanner scanner = new Scanner(System.in);

    public Pet() {
    }

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

    public void addPet(){
        String animalType;
        System.out.println("Tu mascota es un perro o un gato?: ");
        animalType = scanner.nextLine();

        
        Pet mascota = new Pet();
    }
}
