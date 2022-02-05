package filter;

import java.util.Scanner;
import filter.MannedSpacecraft;
import filter.TransportSpaceship;
import filter.UnmannedSpacecraft;
import filter.Spaceships;
import java.util.Arrays;
import filter.SpaceTransportSystem;
import java.util.HashSet;

/**
 *
 * @author JUANES
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Se instancia la clase TransportSpaceship;
         */
        TransportSpaceship transportSpaceship;
        transportSpaceship = new TransportSpaceship();
        String[] typeOperation = {"Transporte de carga pesada", "lanzar una sonda", "llevar tripulacion Humana"};
        
        /**
         * Se instancia la clase UnmannedSpacecraft;
         */
        
        UnmannedSpacecraft unmannedSpaceCraft;
        unmannedSpaceCraft = new UnmannedSpacecraft();
        String[] typeoperationShipUnmannedSpaceCraft = {"Lanzar sonda orbital cercana", "lanzar sonda interplanetaria"};
        
        /**
         * Se instancia la clase MannedSpacecraft;
         */
        
        MannedSpacecraft mannedSpaceCraft;
        mannedSpaceCraft = new MannedSpacecraft();
        String[] operationHuman = {"Mision de mantenimiento", "Experimentos en la EEI"};
        
        /**
         * Se instancia la clase SpaceTransportSystem;
         */
        
        SpaceTransportSystem spaceTransportSystem;
        spaceTransportSystem = new SpaceTransportSystem();
        
        
        /**
         * se agrega un Scanner para permitir ingresar datos en la consola del
         * programa
         */
        
        Scanner scanner = new Scanner(System.in);
        int makeShip;
        
        /**
         * Preguntamos que si desea conocer informacion general sobre las
         * diferentes naves o crear una propia. Se siguen las intruscciones
         * pedidas en la consola.
         */
        
        do {
            System.out.println("Ingresa un valor 1. para traer info general de las naves. 2. para crear tu propia nave o 3. para salir");
            makeShip = scanner.nextInt();
            if (makeShip == 1) {
                System.out.println("De que tipo de nave quieres traer informacion? 1) lanzadoras, 2) No tripuladas, 3) Tripuladas, 4) Transbordador Espacial.  el numero de la opcion");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Haz elegido: una Nave lanzadora: ");
                        transportSpaceship.infoGeneral();
                        break;
                    case 2:
                        System.out.println("Haz elegido: una No triupulada");
                        unmannedSpaceCraft.infoGeneral();
                        break;
                    case 3:
                        System.out.println("Haz elegido: una Nave Tripulada/Mantenimiento");
                        mannedSpaceCraft.infoGeneral();
                        break;
                    case 4:
                        System.out.println("Haz elegido: un Transbordador");
                        spaceTransportSystem.workingTime(1970, 2011);                       
                        spaceTransportSystem.infoGeneral();
                        break;
                    default:
                        System.out.println("ups, esa no era una opcion correcta, comienza de nuevo por favor");
                }
            } else if (makeShip == 2) {
                System.out.println("Que tipo de nave quieres construir?: 1) lanzadoras, 2) No tripuladas, 3) Tripuladas. Ingresa el numero de la opcion");
                int opcionShip = scanner.nextInt();
                switch (opcionShip) {
                    case 1:
                        System.out.println("Cuanto pesaria tu nave lanzadora? (mayor a 1000 kilogramos)");
                        int launchWeight = scanner.nextInt();
                        transportSpaceship.setWeight(launchWeight);
                        System.out.println(" Que tipo de carga transportaria?: 1)Transporte carga pesada  2)lanzar una sonda  3)llevar tripulacion Humana. Ingresa el numero de la opcion");
                        int typeOperationShip = scanner.nextInt();
                        transportSpaceship.setOperation(typeOperation[typeOperationShip - 1]);
                        System.out.println("La vas a usar para: " + transportSpaceship.getOperation());
                        System.out.println("Tu nave va a pesar: " + transportSpaceship.getWeight() + " kilogramos" + " y su uso sera para: " + transportSpaceship.getOperation());
                        break;
                    case 2:
                        System.out.println("Cuanto pesaria tu nave no tripulada? (menor a 1000 kilogramos)");
                        int launchWeightUnmannedSpace = scanner.nextInt();
                        unmannedSpaceCraft.setWeight(launchWeightUnmannedSpace);
                        System.out.println("Que tipo sonda lanzarias?: 1)Lanzar sonda orbital cercana 2)lanzar sonda interplanetaria.  Ingresa el numero de la opcion");
                        int typeOperationShipUnmannedSpace = scanner.nextInt();                      
                        System.out.println("La vas a usar para: " + typeoperationShipUnmannedSpaceCraft[typeOperationShipUnmannedSpace - 1]);
                        System.out.println("Tu nave va a pesar: " + launchWeightUnmannedSpace + " kilogramos" + " y su uso sera para: " + typeoperationShipUnmannedSpaceCraft[typeOperationShipUnmannedSpace - 1]);
                        break;
                    case 3:
                        System.out.println("Cuanto pesaria tu nave  tripulada? (menor a 1000 kilogramos)");
                        int launchWeightMannedSpace = scanner.nextInt();
                        spaceTransportSystem.setWeight(launchWeightMannedSpace);     
                        System.out.println("Que tipo de mision realiza la tripulacion? 1) mision de mantemiento 2)Experimentos en la EEI. Ingresa el numero de la opcion ");
                        int typeOperationMannedSpace = scanner.nextInt();
                        System.out.println("La vas a usar para: " + operationHuman[typeOperationMannedSpace - 1]);
                        System.out.println("Tu nave va a pesar: " + launchWeightMannedSpace + " kilogramos" + " y la utilizaras para " + operationHuman[typeOperationMannedSpace - 1]);
                        break;
                    default:
                        System.out.println("ups no has seleccionado los datos pedidos, intenta de nuevo");
                };
            };
        } while (makeShip < 3);
        scanner.close();
    }
}
