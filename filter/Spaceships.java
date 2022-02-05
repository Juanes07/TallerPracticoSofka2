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
    public Spaceships(){
        
     
       this.weight = 0;
       this.efficient = false;
       this.interplanetary = false;
    }
    
    public  void workingTime(int years){    
        System.out.println("Funciono desde " + years +" hasta ");
    }   
    /**
     * Con este metodo buscamos que por cada clase se de una informacion general de dicha clase
     */
    public abstract void infoGeneral();
    
}


