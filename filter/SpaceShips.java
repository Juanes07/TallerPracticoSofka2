package filter;

/**
 *
 * @author JUANES
 */
public abstract class Spaceships {
    public long weight;
    public boolean efficient;
    public boolean interplanetary;
    public Spaceships(){
     
       this.weight = 0;
       this.efficient = false;
       this.interplanetary = false;
    }
    
    public  void workingTime(){    
        System.out.println("1970 hasta ");
    }   
    /**
     * Con este metodo buscamos que por cada clase se de una informacion general de dicha clase
     */
    public abstract void infoGeneral();
    
}


