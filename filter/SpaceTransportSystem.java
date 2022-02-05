
package filter;
import java.util.Arrays;

/**
 *  STS hace referencia a las siglas en inlges de  Space Transport System o sistema de transporte espacial, nombre clave de los transbordadores
 * @author JUANES
 */
public class SpaceTransportSystem extends Spaceships implements IInfoExtra {
    
    public long initialWeight;
    /**
     * constructor Spaceships
     */
    public SpaceTransportSystem() {
        this.efficient = false;
        this.interplanetary = false;
        this.weight = 0;
        this.initialWeight = 100000;
      
    }
    
    public String [] nameShips(){
        nameShips[5] = "Mision de mantenimiento";
        nameShips[6] = "Experimentos en la EEI";
        return nameShips;
    }
    
    /**
     * 
     * @return seats
     */
    
    public long getWeight() {
        return weight;
    }
    
    /**
     * Refleja el peso asignado por el usuario
     * @param weight peso en kilogramos de la nave SpaceTransportSystem
     */
    
    public void setWeight(long weight) {
        this.weight = weight;
    }
    
    /**
     * Refleja en este caso un false debido a que la nave no es eficiente en temas de combustible/empuje
     * @return un false del atributo efficient
     */
    
    public boolean isEfficient() {
        return efficient;
    }
    
    /**
    * Refleja valor true o false de la variable efficiente asignado por el usuario
    * @param efficient sera un false o true
    */
    
    
    public void setEfficient(boolean efficient) {
        this.efficient = efficient;
    }
    
    /**
     * Refleja en este caso un true debido a que este tipo de naves llega a hacer viajes interplanetarios sin gastar mucho combustible;
     * @return un false del atributo Interplanetary
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
     * Se hace una Sobrecarga del metodo workingTime heredado de la clase Spaceships
     */
    
     public  int workingTime(int years, int year){    
        System.out.println("Funciono desde " + years +" hasta " + year);
        return year;
    }
     
     /**
     * Se hace una Sobreescritura del metodo infoGeneral heredado de la clase Spaceships
     */
     
    @Override
    public void infoGeneral() {
        
        System.out.println("La informacion general de un Transbordador espacial  es: " + "Su peso puede ser de mas de: " + initialWeight + " kilogramos");
        System.out.println("Son eficientes? "  + efficient + " debido a que se necesita de una nave extra para brindarle mayor impulso y salir de orbitra actualmente se estudian otras tecnologias para tener menor consumo pero mayor impulso");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " ya que se utilizaron mayormente para experimentos en orbita y lanzamiento de satelites. incluso para la construccion de la EEI");
        System.out.println("Alcanza una velocidad maxima de despegue de: "+ averageSpeed + " Kilometros");
    }
}
