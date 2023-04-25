public class Cat extends Pet {
    String animal = "Gato";
    public Cat(String pet_name,String raze, boolean vaccine, String origin_country, float pet_price, String animal) {
        super(pet_name,raze, vaccine, origin_country, pet_price, animal);
    }
    public void makeSound() {
      System.out.println("Meow");
    }
    public void presentation(){
      System.out.println("Nombre: "+pet_name+", Raza: "+raze+", Vacuna: "+vaccine+", Origen: "+origin_country+ ", Precio: "+pet_price+", Animal: "+animal);

  }
}
