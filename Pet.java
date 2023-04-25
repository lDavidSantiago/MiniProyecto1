
    class Pet {
        String pet_name;
        String raze;
        boolean vaccine;
        String origin_country;
        float pet_price;
        String animal;
    
    
        public Pet(String pet_name,String raze, boolean vaccine, String origin_country, float pet_price, String animal) {
            this.pet_name = pet_name;
            this.raze = raze;
            this.vaccine = vaccine;
            this.origin_country = origin_country;
            this.pet_price = pet_price;
            this.animal= animal;
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
        public String getPet_name() {
            return pet_name;
        }

        public void setPet_name(String pet_name) {
            this.pet_name = pet_name;
        }
        public void makeSound() {
            System.out.println("The animal makes a sound");
          }
        public void animalid(){
            System.out.println("My animal");
        }
        public void presentation(){
            System.out.println("Nombre: "+pet_name+", Raza: "+raze+", Vacuna: "+vaccine+", Origen: "+origin_country+ ", Precio: "+pet_price+", Animal: ");

        }
        public String getRaze() {
            return raze;
        }

        public void setRaze(String raze) {
            this.raze = raze;
        }

        }
        
    

