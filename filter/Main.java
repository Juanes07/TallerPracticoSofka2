package filter;
import java.util.Scanner;
/**
 *
 * @author JUANES
 */
public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola cosmonauta, ingresa el numero de una de las opciones para empezar a crear tu nave");
        System.out.println("1) Nave lanzadora");
        System.out.println("2) Nave No triupulada");
        System.out.println("3) Nave Tripulada/Mantenimiento");
        opcion = sc.nextInt();
        switch (opcion){
            case 1: System.out.println("Haz elegido, una Nave lanzadora");
            break;
            case 2: System.out.println("Haz elegido, una No triupulada");
            break;
            case 3: System.out.println("Haz elegido, una Nave Tripulada/Mantenimiento");
            break;
            default: System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
        }
    }
}
