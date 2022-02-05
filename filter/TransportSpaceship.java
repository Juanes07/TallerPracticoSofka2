
package filter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * la clase TransportSpaceship hace referencia a las naves tripuladas
 * @author JUANES
 */
public class TransportSpaceship extends Spaceships {
    /**
     * constructor de la clase TransportSpaceship 
     */
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
    
    /**
     * Refleja el peso asignado en el constructor
     * @return el peso de la nave tripulada
     */
    
    public long getWeight() {
        System.out.println("Por lo general este tipo de naves va a tener un peso aproximado de" + weight);
        return weight;
    }
    
    /**
     * Refleja el peso asignado por el usuario
     * @param weight peso en kilogramos de la nave  tripulada
     */
    
    public void setWeight(long weight) {
        System.out.println("Esta Nave pesaria" + weight);
        this.weight = weight;
    }
    
    /**
     * Refleja en este caso un false debido a que la nave no es eficiente en temas de combustible/empuje
     * @return un false del atributo efficient
     */
    
    public boolean isEfficient() {
        System.out.println("Este tipo de naves es  eficiente siempre y cuando sea poca su carga");
        return efficient;
    }
    
    /**
    * Refleja valor true o false de la variable efficiente asignado por el usuario
    * @param efficient sera un false o true
    */
    
    public void setEfficient(boolean efficient) {
        System.out.println("Este tipo de naves es poco eficiente");
        this.efficient = efficient;
    }
    
    /**
     * Refleja en este caso un false debido a que este tipo de naves no llega a hacer viajes interplanetarios;
     * @return un false del atributo isInterplanetary
     */
    
    public boolean isInterplanetary() {
        System.out.println("Este tipo de naves sera interplanetaria en futuro lejano");
        return interplanetary;
    }

    /**
     * Refleja en este caso valor true o false de la variable interplanetary asignado por el usuario
     * @param interplanetary puede ser false o true
     */
    public void setInterplanetary(boolean interplanetary) {
        System.out.println("Este tipo de naves no es interplanetaria");
        this.interplanetary = interplanetary;
    }
    
     /**
     * Se hace una Sobreescritura del metodo infoGeneral heredado de la clase Spaceships
     */
    
    @Override
    public void infoGeneral() {
        System.out.println("La informacion general de una nave lanzadora es" + "Su peso puede variar desde: " + weight + " Hasta 3000 kilogramos");
        System.out.println("Son eficientes? " + efficient + " debido a su alto consumo de combustible y no tienen el impulso suficiente para salir de la orbita gravitacional de la tierra");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " Debido a su alto consumo de combustible se investigan otro tipo de naves para hacer viajes ida y regreso por ejemplo a marte");
    }
     
}
