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
        System.out.print("Su mascota es un perro o un gato? Gato = 1 | Perro = 2: ");
        byte identifier = input.nextByte();
        clearScreen();
        input.nextLine();
        System.out.print("Nombre: ");
        String originName = input.nextLine();
        System.out.print("Raza: ");             
        String razeName = input.nextLine();
        System.out.print("Vacuna Malota si = 1 | no = 2: ");//Cambiar para que reciba "si" y "no" y lo transforme en booleano
        Boolean vaccineValue ;
        byte vm;
        vm = input.nextByte();
        if (vm==1){
            vaccineValue=true;
        }
        else{
            vaccineValue=false;
        }
        System.out.print("Origen: ");
        input.nextLine();
        String originValue = input.nextLine();
        System.out.print("Precio: ");
        float priceValue = input.nextFloat();

        if(identifier==1){
            Cat n = new Cat(originName,razeName,vaccineValue,originValue,priceValue,"Gato");
            arrayOfPets.add(n);
        }
        else if(identifier==2){
            Dog n = new Dog(originName,razeName,vaccineValue,originValue,priceValue,"Perro");
            arrayOfPets.add(n);

        }
        ////////////////////////////////////////////////////////////////////////////////////////////////
        if(identifier==1){
            System.out.println("Su gato ha sido introducido al menu correctamente :D");
            input.nextLine();
        }
        else if(identifier==2){
            System.out.println("Su perro ha sido introducido al menu correctamente :D");
            input.nextLine();
        }
        input.nextLine();
    }
    //PUNTO 2
    public void change_pets_values(){
        System.out.print("ingrese el nombre del animal que quiere realizar cambios: ");
        String temp_name = input.nextLine();
        int index = 0;
        for (Pet pet: arrayOfPets){
            String xd = pet.pet_name;
                if(temp_name.equals(xd)){
                    System.out.print("Nombre: ");
                    String newName = input.nextLine();
                    System.out.print("Raza: ");
                    String newrazeName = input.nextLine();
                    System.out.print("Vacuna Malota si = 1 | no = 2: ");
                    Byte nvm ;
                    Boolean newvaccineValue;
                    nvm= input.nextByte();
                    if (nvm==1){
                        newvaccineValue=true;
                    }
                    else{
                        newvaccineValue=false;
                    }                  
                    System.out.print("Origen: ");
                    input.nextLine();
                    String neworiginValue = input.nextLine();
                    System.out.print("Precio: ");
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
            System.out.print("ingrese el nombre del animal que quiere eliminar: ");
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
            System.out.print("ingrese el nombre del animal que quiere buscar: ");
            String temp_name = input.nextLine();
            int index = 0;
            for (Pet pet: arrayOfPets){
                String xd = pet.pet_name;
                    if(temp_name.equals(xd)){
                        clearScreen();
                        arrayOfPets.get(index).presentation();}
                index = index+1;}
            Scanner s = new Scanner(System.in);
            
            s.nextLine();
            //s.close();---Revisar cerrar s, pues me saltó un error cuando lo cerraba, de todas formas revisar
        }

        public void tieneVacunas (){
            int numeroVacunas=0;
            int index = 0;
            for (Pet pet: arrayOfPets){
                boolean xd = pet.vaccine;
                    if (xd==true){
                        clearScreen();
                        //arrayOfPets.get(index).presentation();//qué hace?
                        numeroVacunas++;
                    }
                    
                index = index+1;}
                input.nextLine();
                index = index+1;
            }
            System.out.println("Cantidad de Mascotas con la vacuna malota: "+numeroVacunas);
            Scanner s = new Scanner(System.in);
            s.nextLine();
            //s.close();---Revisar cerrar s, pues me saltó un error cuando lo cerraba, de todas formas revisar

        }
        public void latinoamerica(){//ojo
            String[] Paises = {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador", "El Salvador", "Guatemala", "Honduras", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "Puerto Rico", "República Dominicana", "Uruguay", "Venezuela"};//20 paises
            int index =0;
            for (Pet pet: arrayOfPets){
                for (int i=0;i<20;i++){//me va a imprimir 20 veces el animal con origen extranjero
                    String xd = pet.origin_country;
                    if(xd!=Paises[i]){
                        clearScreen();//esto hace que no se vean los 19 prints anteriores, pero tambien borra el animal anterior.
                        System.out.println("Nombre: "+pet.pet_name+", Raza: "+pet.raze+", Vacuna: "+pet.vaccine+", Origen: "+pet.origin_country+ ", Precio: "+pet.pet_price+", Animal: "+pet.animal);
                    }
                }
                
            }
            Scanner s = new Scanner(System.in);
            s.nextLine();
            

        }
}