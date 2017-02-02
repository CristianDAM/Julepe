
/**
 * Write a description of class Baza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baza
{
    private int jugadoresEnLaBaza;
    private int cartasEnLaBaza;
    private Carta[] baza;

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numJugadoresTiranCarta, int paloQuePinta)
    {
        jugadoresEnLaBaza = numJugadoresTiranCarta;
        baza = new Carta[numJugadoresTiranCarta];
        cartasEnLaBaza = 0;

    }

    public void addCarta(Carta cartaQueSeTira, String nombreJugadorQueTira)
    {
        baza[cartasEnLaBaza] = cartaQueSeTira;
        cartasEnLaBaza++;

    }
    
      public int getPaloPrimeraCartaDeLaBaza()
    {
        int palo = -1;
        if (baza[0] != null){
            palo = baza[0].getPaloCarta();
        }
        return palo;

    }


  
}
