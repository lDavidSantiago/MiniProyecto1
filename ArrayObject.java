import java.util.ArrayList;
import java.util.Scanner;

public class ArrayObject {
    ArrayList<Pet> arrayOfPets = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void main (){
        arrayOfPets.add(new Pet(false, null, 0));
        arrayOfPets.add(new Pet(false, "Colombia", 15000));
        arrayOfPets.add(new Pet(false, "Colombia", 15000));
        arrayOfPets.add(new Pet(false, "Colombia", 15000));

        for (Pet pet: arrayOfPets) {
            System.out.println("Vacuna: "+pet.vaccine+", Origen: "+pet.origin_country+ "Precio: "+pet.pet_price);
        }
    }
    public void insert_pets(){
        System.out.println("Vacuna: ");
        Boolean vaccineValue = input.nextBoolean();
        System.out.println("Origen: ");
        input.nextLine();
        String originValue = input.nextLine();
        System.out.println("Precio: ");
        float priceValue = input.nextFloat();
        Pet n = new Pet(vaccineValue,originValue,priceValue);
        arrayOfPets.add(n);
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
