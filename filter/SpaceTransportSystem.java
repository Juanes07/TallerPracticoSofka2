
package filter;
import java.util.Arrays;

/**
 *  STS hace referencia a las siglas en inlges de  Space Transport System o sistema de transporte espacial, nombre clave de los transbordadores
 * @author JUANES
 */
public class SpaceTransportSystem extends Spaceships implements IInfoExtra {
     
    public int seats = 0;
    public SpaceTransportSystem() {
        this.efficient = false;
        this.interplanetary = false;
        this.weight = 100000;
        this.seats = 7;

    }
    
    public String [] nameShips(){
        nameShips[5] = "Mision de mantenimiento";
        nameShips[6] = "Experimentos en la EEI";
        return nameShips;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

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

     public static void workingTime(int year){    
        System.out.println("Funciono desde 1970 hasta " + year);
    }
    
    
    @Override
    public void infoGeneral() {
        
        System.out.println("La informacion general de un Transbordador espacial  es: " + "Su peso puede ser de mas de: " + weight + " kilogramos");
        System.out.println("Son eficientes? "  + efficient + " debido a que se necesita de una nave extra para brindarle mayor impulso y salir de orbitra actualmente se estudian otras tecnologias para tener menor consumo pero mayor impulso, aunque su velocidad es de "+ averageSpeed + " Kilometros en su punto maximo de despegue");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " ya que se utilizaron mayormente para experimentos en orbita y lanzamiento de satelites. incluso para la construccion de la EEI");
    }
}
