package filter;
import java.util.Scanner;
import filter.MannedSpacecraft;
import filter.TransportSpaceship;
import filter.UnmannedSpacecraft;
import filter.Spaceships;
import java.util.Arrays;
import filter.Sts;

/**
 *
 * @author JUANES
 */
public class Main {
    public static void main(String[] args) {
        TransportSpaceship ts;
        ts = new TransportSpaceship();
        String [] transportShip = ts.typeOperation();
        UnmannedSpacecraft usc;
        usc = new UnmannedSpacecraft();
       String [] objectiveUnmannedSpace = usc.objectiveUnmannedSpace();
        
        MannedSpacecraft msc;
        msc = new MannedSpacecraft();
        String [] spaceManned = msc.Spaceships();
        Sts Shuttle;
        Shuttle = new Sts();
        
          
          Scanner sc = new Scanner(System.in);
          boolean makeShip;

          System.out.println("Ingresa un valor boleano (true o false). True para traer info general de las naves. False para crear tu propia nave");
          makeShip =  sc.nextBoolean();
          if(makeShip == true){
                    System.out.println("De que tipo de nave quieres traer informacion? 1) lanzadoras, 2) No tripuladas, 3) Tripuladas, 4) Transbordador Espacial. Ingresa el numero de la opcion");
                    int opcion = sc.nextInt();
                switch(opcion){
                    case 1: System.out.println("Haz elegido: una Nave lanzadora y tiene estas caracteristicas generales: ");
                            ts.infoGeneral();
                        break;
                    case 2: System.out.println("Haz elegido: una No triupulada");
                            usc.infoGeneral();
                        break;
                    case 3: System.out.println("Haz elegido: una Nave Tripulada/Mantenimiento");
                            msc.infoGeneral();
                        break;
                    case 4: System.out.println("Haz elegido: un Transbordador");
                        Shuttle.workingTime(2011);
                        Shuttle.infoGeneral();
                        break;
                        default: System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");  
                    }
          } else { 
                    System.out.println("Que tipo de nave quieres construir?: 1) lanzadoras, 2) No tripuladas, 3) Tripuladas. Ingresa el numero de la opcion" );
                    int opcionShip = sc.nextInt();
                switch(opcionShip){
                     case 1: System.out.println("Cuanto pesaria tu nave lanzadora? (mayor a 1000 kilogramos)");
                                int launchWeight = sc.nextInt();
                                System.out.println(" Que tipo de carga transportaria?: 1)Transporte carga pesada  2)lanzar una sonda  3)llevar tripulacion Humana. Ingresa el numero de la opcion");
                                int typeOperationShip = sc.nextInt();
                                System.out.println("La vas a usar para: " + transportShip[typeOperationShip-1]);
                                System.out.println("Tu nave va a pesar: " + launchWeight + " kilogramos" + " y su uso sera para: " + transportShip[typeOperationShip-1] );
                           break;
                     case 2: System.out.println("Cuanto pesaria tu nave no tripulada? (menor a 1000 kilogramos)");
                             int launchWeightUnmannedSpace = sc.nextInt(); 
                             System.out.println("Que tipo sonda lanzarias?: 1)Lanzar sonda orbital cercana 2)lanzar sonda interplanetaria.  Ingresa el numero de la opcion");        
                             int  typeOperationShipUnmannedSpace = sc.nextInt();
                             System.out.println("La vas a usar para: " + objectiveUnmannedSpace[typeOperationShipUnmannedSpace-1]);
                             System.out.println("Tu nave va a pesar: " + launchWeightUnmannedSpace + " kilogramos" + " y su uso sera para: " + objectiveUnmannedSpace[typeOperationShipUnmannedSpace-1] );
                           break;
                     case 3: System.out.println("Cuanto pesaria tu nave no tripulada? (menor a 1000 kilogramos)");
                             int launchWeightMannedSpace = sc.nextInt();
                             System.out.println("Que tipo de mision realiza la tripulacion? 1) mision de mantemiento 2)Experimentos en la EEI ");
                             int typeOperationMannedSpace = sc.nextInt();
                             System.out.println("La vas a usar para: " + spaceManned[typeOperationMannedSpace-1]);
                             System.out.println("Tu nave va a pesar: " + launchWeightMannedSpace + " kilogramos" + " y la utilizaras para " + spaceManned[typeOperationMannedSpace-1] );
                           break;
                     default: System.out.println("ups no has seleccionado los datos pedidos, intenta de nuevo"); 
                            
                }               
          }
         
 
    } 
}
         


 