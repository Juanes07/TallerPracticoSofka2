
package filter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author JUANES
 */
public class TransportSpaceship extends Spaceships {
       
    public TransportSpaceship() {
        
        this.efficient = false;
        this.interplanetary = false;
        this.weight = 1000;
    }
    String [] operationShip = new String[3];
    
    public String[] typeOperation() {
        operationShip[0] = "Transporte de carga pesada";
        operationShip[1] = "lanzar una sonda";
        operationShip[2] = "llevar tripulacion Humana";
        return operationShip;
    }
    

    public String getOperation() {
        System.out.println("El tipo de operacion de estas naves puede ser de: " + operationShip);
        return operation;
    }

    public void setOperation(String operation) {
        System.out.println("El tipo de operacion de estas naves puede ser de: " + operation);
        this.operation = operation;
       
    }

    public long getWeight() {
        System.out.println("Por lo general este tipo de naves va a tener un peso aproximado de" + weight);
        return weight;
    }

    public void setWeight(long weight) {
        System.out.println("Esta Nave pesaria" + weight);
        this.weight = weight;
    }

    public boolean isEfficient() {
        System.out.println("Este tipo de naves es  eficiente siempre y cuando sea poca su carga");
        return efficient;
    }

    public void setEfficient(boolean efficient) {
        System.out.println("Este tipo de naves es poco eficiente");
        this.efficient = efficient;
    }

    public boolean isInterplanetary() {
        System.out.println("Este tipo de naves sera interplanetaria en futuro lejano");
        return interplanetary;
    }

    public void setInterplanetary(boolean interplanetary) {
        System.out.println("Este tipo de naves no es interplanetaria");
        this.interplanetary = interplanetary;
    }
    
    
    
    
    
    @Override
    public void infoGeneral() {
        System.out.println("La informacion general de una nave lanzadora es" + "Su peso puede variar desde: " + weight + " Hasta 3000 kilogramos");
        System.out.println("Son eficientes? " + efficient + " debido a su alto consumo de combustible y no tienen el impulso suficiente para salir de la orbita gravitacional de la tierra");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " Debido a su alto consumo de combustible se investigan otro tipo de naves para hacer viajes ida y regreso por ejemplo a marte");
    }
     
}
