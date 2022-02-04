package TallerPracticosofka2.filter;

/**
 *
 * @author JUANES
 */
public abstract class Spaceships {
    public String[] typeOfUsage;
    public String operation;
    public long weight;
    public boolean efficient;
    public boolean interplanetary;
    
    
    public Spaceships(){
       String[] typeofUsage = {"Satelites", "Sondas", "Tripuladas"};
       this.weight = 0;
       this.efficient = false;
       this.interplanetary = false;
    }
  
    public abstract void infoGeneral();
    
}


