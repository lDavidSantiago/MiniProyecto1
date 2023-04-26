import java.util.ArrayList;
import java.util.Scanner;

public class ArrayObject {
    ArrayList<Pet> arrayOfPets = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
     
    }
    public void main_array (){
        for (Pet pet: arrayOfPets) {
            System.out.println("Nombre: "+pet.pet_name+", Raza: "+pet.raze+", Vacuna: "+pet.vaccine+", Origen: "+pet.origin_country+ ", Precio: "+pet.pet_price+", Animal: "+pet.animal);
        }
    }
    public void insert_pets(){
        System.out.println("Nombre: ");
        String originName = input.nextLine();
        System.out.println("Raza: ");
        String razeName = input.nextLine();
        System.out.println("Vacuna Malota: ");
        Boolean vaccineValue = input.nextBoolean();
        System.out.println("Origen: ");
        input.nextLine();
        String originValue = input.nextLine();
        System.out.println("Precio: ");
        float priceValue = input.nextFloat();
        System.out.println("Su mascota es un perro o un gato? Gato = 1 | Perro = 2");
        byte identifier = input.nextByte();
        if(identifier==1){
            Cat n = new Cat(originName,razeName,vaccineValue,originValue,priceValue,"Gato");
            arrayOfPets.add(n);
        }
        else if(identifier==2){
            Cat n = new Cat(originName,razeName,vaccineValue,originValue,priceValue,"Perro");
            arrayOfPets.add(n);

        }
        input.nextLine();

    }
    //PUNTO 2
    public void change_pets_values(){
        System.out.println("ingrese el nombre del animal que quiere realizar cambios: ");
        String temp_name = input.nextLine();
        int index = 0;
        for (Pet pet: arrayOfPets){
            String xd = pet.pet_name;
                if(temp_name.equals(xd)){
                    System.out.println("Nombre: ");
                    String newName = input.nextLine();
                    System.out.println("Raza: ");
                    String newrazeName = input.nextLine();
                    System.out.println("Vacuna Malota: ");
                    Boolean newvaccineValue = input.nextBoolean();
                    System.out.println("Origen: ");
                    input.nextLine();
                    String neworiginValue = input.nextLine();
                    System.out.println("Precio: ");
                    float newpriceValue = input.nextFloat();
                        //Remplazar los valores
                        arrayOfPets.get(index).setPet_name(newName);
                        arrayOfPets.get(index).setOrigin_country(neworiginValue);
                        arrayOfPets.get(index).setPet_price(newpriceValue);
                        arrayOfPets.get(index).setVaccine(newvaccineValue);
                        arrayOfPets.get(index).setRaze(newrazeName);}
            index = index+1; //Para saber la posicion actual de el array con respecto a la iteracion
        }
        input.nextLine();   
        }
        //PUNTO 3
        public void remove_mascota(){
            System.out.println("ingrese el nombre del animal que quiere eliminar: ");
            String temp_name = input.nextLine();
            for (Pet pet: arrayOfPets){
                String xd = pet.pet_name;
                    if(temp_name.equals(xd)){
                        clearScreen();
                        arrayOfPets.remove(pet);
                        return;}
                }
            }


        //PUNTO 4
        public void test(){
            System.out.println("ingrese el nombre del animal que quiere buscar: ");
            String temp_name = input.nextLine();
            int index = 0;
            for (Pet pet: arrayOfPets){
                String xd = pet.pet_name;
                    if(temp_name.equals(xd)){
                        clearScreen();
                        arrayOfPets.get(index).presentation();}
                index = index+1;}
            Scanner s = new Scanner(System.in);
            s.close();
            s.nextLine();

        }

}

    
    
