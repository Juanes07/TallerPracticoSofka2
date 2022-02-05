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
    public Spaceships(){   
       this.weight = weight;
       this.efficient = efficient;
       this.interplanetary = interplanetary;       
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    
    /**
     * 
     * @param years 
     */
    
    public  void workingTime(int years){    
        System.out.println("Funciono desde " + years +" hasta ");
    }   
    /**
     * Con este metodo buscamos que por cada clase se de una informacion general de dicha clase
     */
    public abstract void infoGeneral();
    
    
}


