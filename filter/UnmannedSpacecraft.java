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
     String [] typeoperationShip = new String[2];
    
    public String[] objectiveUnmannedSpace() {
        typeoperationShip[0] = "Lanzar sonda orbital cercana";
        typeoperationShip[1] = "lanzar sonda interplanetaria";

        return typeoperationShip;
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

    
    
    @Override
    public void infoGeneral() {
        System.out.println("La informacion general de una nave no tripulada es: " + "Su peso puede variar desde: " + weight + " Hasta 1000 kilogramos");
        System.out.println("Son eficientes? "  + efficient + " debido a su bajo consumo de combustible");
        System.out.println("Pueden llegar a otros planetas? " + interplanetary + " al tener un empuje bajo permite recorrer largas distancias por inercia");
    }
    
}
