import java.util.Scanner;


public class Menuu {
    Scanner scanner = new Scanner(System.in);
    private byte opcion;
    public Menuu(){
        
    }
    public static void clearScreen() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
     
    }
    public void mostrarMenu(){

        System.out.println("===VETERINARIA PATITAS==");
        System.out.println("\nBienvenido, estamos para servirle.\n");
        System.out.println("1. Insertar mascota\n2. Actualizar mascota\n3. Eliminar mascota\n4. Buscar mascota por nombre\n5. Listar todas las mascotas");
        System.out.println("Seleccione una opcion: ");
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
            
        
            default:
                clearScreen();

                mostrarMenu();
                break;
        }
        
        scanner.close();
    }
}