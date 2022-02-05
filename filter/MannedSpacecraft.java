package filter;
import java.util.Arrays;

/**
 *
 * @author JUANES
 */
public class MannedSpacecraft extends Spaceships implements IInfoExtra{
    /**
     * constructor de la clase MannedSpacecraft
     */
    public MannedSpacecraft() {
        this.efficient = true;
        this.interplanetary = false;
        this.weight = 400;
    }
    /**
     * Creamos un arraylist al cual le especificamos el tamaño de este
     */
    String [] typeOperationMannedSpace = new String[2];
    /**
     * le agregamos sus elementos al arraylist typeOperationMannedSpace
     * @return typeOperationMannedSpace 
     */
    public String [] Spaceships(){
        typeOperationMannedSpace[0] = "Mision de mantenimiento";
        typeOperationMannedSpace[1] = "Experimentos en la EEI";
        return typeOperationMannedSpace;
    }
    
    /**
     * Refleja el peso asignado en el constructor
     * @return el peso de la nave tripulada
     */
    
    public long getWeight() {
        return weight;
    }
    /**
     * Refleja el peso asignado por el usuario
     * @param weight  peso en kilogramos de la nave lanzadora
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
        System.out.println("La informacion general de una nave tripulada es: " + "Su peso puede variar desde: " + weight + " Hasta 1000 kilogramos");
        System.out.println("Son eficientes?" + " " +efficient + " " + " debido a el tipo de combustible que se usa para maniobrar en orbita");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " no debido a las limitantes tecnologicas pero se presume que en un futuro cercano se pueda hacer viaje de ida y vuelta a planetas cercanos");
        System.out.println("Como ejemplo de nave tripulada esta la EEI. Los Paises involucrados en la estacion espacial internacional son:  " + Arrays.toString(counterCountrys));
    }
}
    

