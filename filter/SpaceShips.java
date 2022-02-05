package filter;

/**
 *
 * @author JUANES
 */
public abstract class Spaceships {
    public String operation;
    public long weight;
    public boolean efficient;
    public boolean interplanetary;
    public Spaceships(){
       
       this.operation = "";
       this.weight = 0;
       this.efficient = false;
       this.interplanetary = false;
    }
    
    
    public abstract void infoGeneral();
    
}


