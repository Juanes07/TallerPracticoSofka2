
package filter;

public interface IInfoExtra {
    
    
    /**
     * Se crean los arraylist sobre counterContruys, haciendo referencia a la lista de paises involucrados con la EEI
     * Se crean los arraylist sobre nameShips, haciendo referencia a la lista de nombres dados a  los transbordadores durante los años 1970 hasta 2011
     * Se crea la propiedad averageSpeed que hace referencia a la velocidad promedio de un transbordador en su punto maximo de despegue
     */
    public String[] counterCountrys = {"EEUU(Nasa)","Rusia(EFR)","Japon(AJE),Canada(CSA),Europa[ESA]"};
    public String[] nameShips = {"Columbia","Challenger","Discovery","Atlantis","Endeavour"};
    public float averageSpeed = 7743;
}
