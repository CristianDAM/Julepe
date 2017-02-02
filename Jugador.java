import java.util.Random;
/**
 * Write a description of class Jugador here.
 * 
 * @author (Cristian) 
 * @version (02.02.17)
 */
public class Jugador
{
    private String nombre;
    private Carta[] cartasMano;
    private int numCartasMano;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombre)
    {
        this.nombre = nombre;
        cartasMano = new Carta[5];
        numCartasMano = 0;

    }

    /**
     * Metodo que hace que el jugador reciba una carta
     */
    public  void recibirCarta(Carta cartaARecibir)
    {
        if (numCartasMano < 5)
        {
            cartasMano[numCartasMano] = cartaARecibir;
            numCartasMano++;
        }

    }

    /**
     * Metodo que muestra las cartas del jugador por pantalla
     */
    public void verCartasJugador()
    {
        for (Carta cartaActual : cartasMano){
            if (cartaActual != null){
                System.out.println(cartaActual);
            }
        }
    }

    public String getNombre()
    {
        return nombre;  
    }

    /**
     * Metodo que devuelve la carta especificada como parametro si el jugador dispone de ella y simula que se lanza a la mesa
     */
    public Carta tirarCarta(String nombreCarta)
    {
        Carta cartaATirar = null;
        if (numCartasMano > 0 )
        {
            int cartaActual = 0;
            boolean buscando = true;
            while(cartaActual < cartasMano.length && buscando)
            {
                if(cartasMano[cartaActual] != null)
                {
                    if (nombreCarta.equals(cartasMano[cartaActual].toString()))
                    {
                        buscando = false;
                        cartaATirar = cartasMano[cartaActual];
                        cartasMano[cartaActual] = null;
                        System.out.println(nombre + " ha tirado " + cartaATirar);
                        numCartasMano--;         
                    }
                }
                cartaActual++;
            }     
        }
        return cartaATirar;

    }

    /**
     * Metodo que tira una carta aleatoria
     */
    public Carta tirarCartaAleatoria()
    {
        Carta cartaTirada = null;
        if (numCartasMano > 0)
        {
            Random aleatorio = new Random();
            boolean elJugadorHaTiradoUnaCarta = false;
            while( elJugadorHaTiradoUnaCarta == false)
            {

                int posicionAleatorio = aleatorio.nextInt(5);
                if (cartasMano[posicionAleatorio] != null)
                {
                    cartaTirada = cartasMano[posicionAleatorio];
                    cartasMano[posicionAleatorio] = null;
                    numCartasMano--;
                    System.out.println(nombre + " ha tirado " + cartaTirada);
                     elJugadorHaTiradoUnaCarta = true;
                }
                
            }

        }

        return cartaTirada;

    }
}
