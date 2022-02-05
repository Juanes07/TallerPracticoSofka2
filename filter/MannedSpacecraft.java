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
     * 
     * @return 
     */
    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public boolean isEfficient() {
        return efficient;
    }

    public void setEfficient(boolean efficient) {
        this.efficient = efficient;
    }

    public boolean isInterplanetary() {
        return interplanetary;
    }

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
    

