import java.util.Scanner;


public class Menuu {
    Scanner scanner = new Scanner(System.in);
    private byte opcion;
    public Menuu(){
        
    }
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
     
    }
    public void menuFuncional(){//6
        byte opcion;
        clearScreen();
        System.out.println("===VETERINARIA PATITAS==");
        System.out.println("Bienvenido al menu de funciones.");
        System.out.println("1. Cuantas mascotas tienen la vacuna malota?\n2. Top 5 mascotas más costosas\n3. Que mascotas no tienen país de origen en latinoamérica?\n4. Finalizar programa");
        System.out.print("Seleccione una opcion: ");
        opcion = scanner.nextByte();
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3: 
                break;
            case 4:
                break;
            
        }

    }
    public void mostrarMenu(){
        clearScreen();
        System.out.println("===VETERINARIA PATITAS==");
        System.out.println("\nMENU DE GESTION");
        System.out.println("\nBienvenido, estamos para servirle.\n");
        System.out.println("1. Insertar mascota\n2. Actualizar mascota\n3. Eliminar mascota\n4. Buscar mascota por nombre\n5. Listar todas las mascotas\n6. Menu de opciones funcionales");
        System.out.print("Seleccione una opcion: ");
        opcion = scanner.nextByte();
        
        switch (opcion) {
            //manejar recursividad para siempre al finalizar volver al menu.
            
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            
            
            case 6:
                menuFuncional();
                break;  
            default:
                clearScreen();

                mostrarMenu();
                break;
        }
        
        scanner.close();
    }
}