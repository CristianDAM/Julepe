
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
    private int paloPinta;

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numJugadoresTiranCarta, int paloQuePinta)
    {
        jugadoresEnLaBaza = numJugadoresTiranCarta;
        baza = new Carta[numJugadoresTiranCarta];
        cartasEnLaBaza = 0;
        paloPinta = paloQuePinta;

    }

    /**
     * Metodo que permite añadir una carta a la baza
     */
    public void addCarta(Carta cartaQueSeTira, String nombreJugadorQueTira)
    {
        baza[cartasEnLaBaza] = cartaQueSeTira;
        cartasEnLaBaza++;

    }

    /**
     * Metodo que devuelve el palo de la primera carta de la baza
     */
    public int getPaloPrimeraCartaDeLaBaza()
    {
        int palo = -1;
        if (baza[0] != null){
            palo = baza[0].getPaloCarta();
        }
        return palo;

    }

    public Carta cartaQueVaGanandoLaBaza()
    {
        Carta cartaQueVaGanando = null;
        boolean cartaGana = false;
        Carta cartaUno = baza[0];
        Carta cartaDos = baza[1];
     
       if (cartaUno.getPaloCarta() != cartaDos.getPaloCarta())
        if(cartaUno.getPaloCarta() == paloPinta)
        {
            cartaQueVaGanando = cartaUno;
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        return cartaQueVaGanando;
    
    
    
    
    
    
    
    
    
        
        
    
    }

  
}
