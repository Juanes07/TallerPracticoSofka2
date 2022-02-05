package filter;

/**
 *
 * @author JUANES
 */
public abstract class Spaceships {

    public long weight;
    public boolean efficient;
    public boolean interplanetary;
    public int years = 1970;

    /**
     * Constructor clase Spaceships
     */
    
    public Spaceships() {
        this.weight = weight;
        this.efficient = efficient;
        this.interplanetary = interplanetary;
    }

    /**
     * regresa dependiendo de cada clase valor long distinto
     * @return weight tipo Long
     */
    
    public long getWeight() {
        return weight;
    }
    
    /**
     * asignado por cada clase. refleja valor long
     * @param weight 
     */
    
    public void setWeight(long weight) {
        this.weight = weight;
    }
    
    /**
     * asignado por cada clase
     * @return false o true
     */
    
    public boolean isEfficient() {
        return efficient;
    }
    
    /**
     * asignado por cada clase
     * @param efficient false o true
     */
    
    public void setEfficient(boolean efficient) {
        this.efficient = efficient;
    }
    
    /**
     * asignado por cada clase
     * @return false o true
     */
    
    public boolean isInterplanetary() {
        return interplanetary;
    }

    /**
     * Refleja valor false o true, asignado en cada clase
     * @param interplanetary false o true
     */
    
    public void setInterplanetary(boolean interplanetary) {
        this.interplanetary = interplanetary;
    }

    /**
     * Reflejado en la clase SpaceTransportyStystem
     * @return years valor Int
     */
    
    public int getYears() {
        return years;
    }

    /**
     * Refleja en la clase SpaceTransportyStystem
     * @param years int
     */
    
    public void setYears(int years) {
        this.years = years;
    }

    /**
     * years hace referencia al año en el cual inicio en operacion el tipo de nave
     * @param years tipo Int
     */
    
    public void workingTime(int years) {
        System.out.println("Funciono desde " + years + " hasta ");
    }

    /**
     * Con este metodo buscamos que por cada clase se de una informacion general
     * de dicha clase
     */
    
    public abstract void infoGeneral();

}
