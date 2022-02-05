
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
    public String operation;
    public long initialWeight;
    public TransportSpaceship() {
        
        this.efficient = false;
        this.interplanetary = false;
        this.weight = 0;
        this.initialWeight = 1000;
        
    }
 
    public String getOperation() {
        return operation;
    }

    /**
     * Refleja el peso asignado en el constructor
     * @return el peso de la nave tripulada
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getWeight() {
        
        return weight;
    }
    
    /**
     * Refleja el peso asignado por el usuario
     * @param weight peso en kilogramos de la nave  tripulada
     */
    
    public void setWeight(long weight) {
        
        this.weight = weight;
    }
    
    /**
     * Refleja en este caso un false debido a que la nave no es eficiente en temas de combustible/empuje
     * @return un false del atributo efficient
     */
    
    public boolean getEfficient() {
        return efficient;
    }
    
    /**
    * Refleja valor true o false 
    * @param efficient sera un false
    */
    
    public void setEfficient(boolean efficient) {
        this.efficient = efficient;
    }
    
    /**
     * Refleja en este caso un false debido a que este tipo de naves no llega a hacer viajes interplanetarios;
     * @return un false del atributo isInterplanetary
     */
    
    public boolean isInterplanetary() {
        return interplanetary;
    }

    /**
     * Refleja en este caso valor true o false de la variable interplanetary asignado por el usuario
     * @param interplanetary puede ser false o true
     */
    public void setInterplanetary(boolean interplanetary) {
        this.interplanetary = interplanetary;
    }
    
     /**
     * Se hace una Sobreescritura del metodo infoGeneral heredado de la clase Spaceships
     */
    
    @Override
    public void infoGeneral() {
        System.out.println("La informacion general de una nave lanzadora es: Su peso puede variar desde: " + initialWeight + " Hasta 3000 kilogramos");
        System.out.println("Son eficientes? " + efficient + " debido a su alto consumo de combustible y no tienen el impulso suficiente para salir de la orbita gravitacional de la tierra");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " Debido a su alto consumo de combustible se investigan otro tipo de naves para hacer viajes ida y regreso por ejemplo a marte");
    }  
}
