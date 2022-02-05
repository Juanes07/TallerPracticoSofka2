package filter;

/**
 *
 * @author JUANES
 */
public class UnmannedSpacecraft extends Spaceships {

    public UnmannedSpacecraft() {
        
        this.efficient = true;
        this.weight = 100;
        this.interplanetary = true;
    }

    /**
     * Refleja el peso asignado en el constructor
     * @return el peso de la nave no tripulada
     */
    
    public long getWeight() {
        return weight;
    }
    
    /**
     * Refleja el peso asignado por el usuario
     * @param weight peso en kilogramos de la nave no tripulada
     */
    
    public void setWeight(long weight) {
        this.weight = weight;
    }
    
     /**
     * Refleja en este caso un true debido a que la nave es eficiente en temas de combustible/empuje
     * @return un true del atributo efficient
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
     * @return un true del atributo isInterplanetary
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
        System.out.println("La informacion general de una nave no tripulada es: Su peso puede variar desde: " + weight + " Hasta 1000 kilogramos");
        System.out.println("Son eficientes? "  + efficient + " debido a su bajo consumo de combustible");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " al tener un empuje bajo permite recorrer largas distancias por inercia");
    }
    
}
