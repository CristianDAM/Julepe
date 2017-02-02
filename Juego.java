import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Juego here.
 * 
 * @author (Cristian) 
 * @version (02.02.17)
 */
public class Juego
{
    private Mazo mazo;
    private Jugador[] jugadores;

    private int paloPintar;
    private String jugadorRealJugar;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numJugadoresACrear, String nombreJugadorReal)
    {
        jugadorRealJugar = nombreJugadorReal;

        mazo = new Mazo();

        jugadores = new Jugador[numJugadoresACrear];

        ArrayList<String> posiblesNombres = new ArrayList<String>();
        posiblesNombres.add("Adrian");
        posiblesNombres.add("Alex");
        posiblesNombres.add("Valerie");
        posiblesNombres.add("Cristian");
        posiblesNombres.add("Pablo");
        posiblesNombres.add("Jorge");
        posiblesNombres.add("Jose");
        posiblesNombres.add("Juan");
        posiblesNombres.add("Maria");
        posiblesNombres.add("Paula");
        posiblesNombres.add("Marta");
        posiblesNombres.add("Laura");

        Jugador jugadorReal = new Jugador(nombreJugadorReal);
        jugadores[0] = jugadorReal;

        System.out.println("Bienvenido a la partida" + "  " + nombreJugadorReal);

        Random aleatorio = new Random();

        for (int i = 1; i < numJugadoresACrear;i++)
        {

            int posicionNombresElegido = aleatorio.nextInt(posiblesNombres.size());
            String nombreAleatorioElegido = posiblesNombres.get(posicionNombresElegido);
            posiblesNombres.remove(posicionNombresElegido);
            Jugador jugador = new Jugador(nombreAleatorioElegido);
            jugadores[i] = jugador;
        }


        for (int i = 1; i < numJugadoresACrear;i++)
        {
            System.out.println("Tus rivales son" + " " + jugadores[i].getNombre());

        }
    }

    /**
     * Metodo que permite repartir las cartas a todos los jugadores, repartiento una carta a cada jugador hasta que cada jugador tenga 5. Al final del reparto se debe sacar una 
     * carta mas que indica el palo que pinta
     */
    public int repartirCartas()
    {
        mazo.barajarCartas();
        Carta cartaARepartir = null;
        for (int cartasARepartir = 0; cartasARepartir < 5; cartasARepartir++)
        {           
            for (int jugadorActual = 0; jugadorActual < jugadores.length; jugadorActual++)
            {
                cartaARepartir = mazo.sacarCarta();
                jugadores[jugadorActual].recibirCarta(cartaARepartir);
            }  
        }  
        paloPintar = cartaARepartir.getPaloCarta();

        String textoPalo =  " ";
        switch (paloPintar ){
            case 0:
            textoPalo = "oros";
            break;
            case 1:
            textoPalo = "copas";
            break;
            case 2:
            textoPalo = "espadas";
            break;
            case 3:
            textoPalo = "bastos";
            break;
        }
        System.out.println("Pintan" + " " + textoPalo);
        
        jugadores[0].verCartasJugador();
        return paloPintar;
    }

    public void hacerTrampasYVerCartasDeJugador(String nombreJugador)
    {
        int jugadorActual = 0;
        boolean buscando = true ;
        while (jugadorActual < jugadores.length && buscando){
            if (nombreJugador.equals(jugadores[jugadorActual].getNombre())){
                jugadores[jugadorActual].verCartasJugador();
                buscando = false;

            }
            jugadorActual++;
        }
    }

    public void verCartasJugadorHumano(String nombreJugadorHumano)
    {

    }
}