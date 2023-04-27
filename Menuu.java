import java.util.Scanner;
public class Menuu {
    public static ArrayObject Mascotas = new ArrayObject();
    Scanner scanner = new Scanner(System.in);
    private byte opcion;
    public Menuu(){      
    }
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();    
    }
    public void menuFuncional(){//6
        byte opcion=0;
        clearScreen();
        System.out.println("===VETERINARIA PATITAS==");
        System.out.println("Bienvenido al menu de funciones.");
        System.out.println("1. Cuantas mascotas tienen la vacuna malota?\n2. Top 5 mascotas mas costosas\n3. Que mascotas no tienen pais de origen en latinoamerica?\n4. Regresar al menu de gestion\n5. Finalizar programa");
        System.out.print("Seleccione una opcion: ");
        opcion = scanner.nextByte();
        switch(opcion){
            case 1:
            Mascotas.tieneVacunas();
            clearScreen();
            menuFuncional();
                break;
            case 2:
                Mascotas.Top5();
                clearScreen();
                menuFuncional();
                break;
            case 3: 
                Mascotas.latinoamerica();
                menuFuncional();
                break;
            case 4:
                clearScreen();
                mostrarMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    public void mostrarMenu(){
        clearScreen();
        opcion =0;
        System.out.println("===VETERINARIA PATITAS==");
        System.out.println("\nMENU DE GESTION");
        System.out.println("\nBienvenido, estamos para servirle.\n");
        System.out.println("1. Insertar mascota\n2. Actualizar mascota\n3. Eliminar mascota\n4. Buscar mascota por nombre\n5. Listar todas las mascotas\n6. Menu de opciones funcionales\n7. Finalizar programa");
        System.out.print("Seleccione una opcion: ");
        opcion = scanner.nextByte();
        clearScreen();
        switch (opcion) {
            //manejar recursividad para siempre al finalizar volver al menu.    
            case 1:
                Mascotas.insert_pets();
                clearScreen();
                mostrarMenu();
                break;
            case 2:
                Mascotas.change_pets_values();
                clearScreen();
                mostrarMenu();
                break;
            case 3:
                Mascotas.remove_mascota();
                clearScreen();
                mostrarMenu();
                break;
            case 4:
                Mascotas.test();
                clearScreen();
                mostrarMenu();
                break;
            case 5:
                Mascotas.main_array();
                //Presione ENTER para continuar
                scanner.nextLine();
                scanner.nextLine();
                //
                clearScreen();
                mostrarMenu();
                break;
            case 6:
                clearScreen();
                menuFuncional();
                break;
            case 7:
                System.exit(0);
                break;  
            default:
                clearScreen();
                mostrarMenu();
                break;
        }
        scanner.close();
    }
}