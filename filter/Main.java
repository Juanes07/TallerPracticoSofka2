package TallerPracticosofka2.filter;
import java.util.Scanner;
import TallerPracticosofka2.filter.MannedSpacecraft;
import TallerPracticosofka2.filter.TransportSpaceship;
import TallerPracticosofka2.filter.UnmannedSpacecraft;
/**
 *
 * @author JUANES
 */
public class Main {
    public static void main(String[] args) {
        TransportSpaceship ts;
        ts = new TransportSpaceship();
        
  
          
          Scanner sc = new Scanner(System.in);
          boolean makeShip;

          System.out.println("Ingresa un valor boleano (true o false). True para traer info general de las naves. False para crear tu propia nave");
          makeShip =  sc.nextBoolean();
          if(makeShip == true){
                    System.out.println("De que tipo de nave quieres traer informacion? 1) lanzadoras, 2) No tripuladas, 3) Tripuladas ");
                    int opcion = sc.nextInt();
                switch(opcion){
                    case 1: System.out.println("Haz elegido, una Nave lanzadora y tiene estas caracteristicas generales: ");
                        ts.infoGeneral();
                        break;
                    case 2: System.out.println("Haz elegido, una No triupulada");
                        break;
                    case 3: System.out.println("Haz elegido, una Nave Tripulada/Mantenimiento");
                        break;
                        default: System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");  
                    }
          } else { 
                    System.out.println("Que tipo de nave quieres construir?: 1) lanzadoras, 2) No tripuladas, 3) Tripuladas");
                     int opcionShip = sc.nextInt();
                switch(opcionShip){
                    
                     case 1: System.out.println("Cuanto pesaria tu nave lanzadora? (mayor a 1000 toneladas)");
                                String launchWeight = sc.nextLine();
                                System.out.println("Transporte carga pesada, lanzar una sonda o llevar tripulacion Humana");
                                String typeOperationShip = sc.nextLine();
                                System.out.println("La vas a usar para:" + typeOperationShip);
                                ts.setOperation(typeOperationShip);
                                System.out.println("Tu nave va a pesar:" + launchWeight + "kilogramos" + " y su uso sera para:" + typeOperationShip );
                           break;
                     case 2: System.out.println("Cuanto pesaria tu nave no tripulada? (menor a 1)");
                             String launchWeightUnmannedSpace = sc.nextLine(); 
                             System.out.println("llevaria una sona orbital o interplanetaria");
                             
                             String  typeOperationShipUnmannedSpace = sc.nextLine();
                     default: System.out.println("ups no has seleccionado los datos pedidos, intenta de nuevo"); 
                            
                }               
          }
         
 
    } 
}
         


 