
package TallerPracticosofka2.filter;
import java.util.Arrays;

/**
 *  STS hace referencia a las siglas en inlges de  Space Transport System o sistema de transporte espacial, nombre clave de los transbordadores
 * @author JUANES
 */
public class Sts extends Spaceships implements Ship {

    public Sts() {
    }

    
    
    
    @Override
    public void infoGeneral() {
        
    }

    @Override
    public void spaceAgencies() {
        System.out.println("Paises involucrados en la estacion espacial internacional" + Arrays.toString(counterCountrys));
    }
    
}
