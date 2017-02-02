import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Mazo here.
 * 
 * @author (Cristian) 
 * @version (02.02.17)
 */
public class Mazo
{
    private ArrayList<Carta> mazo;

   
    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        mazo = new ArrayList<Carta>();

      
        for (int i = 0; i < 4; i++){
            for (int j = 1; j <= 12; j++){

                if (j != 8 && j !=9) {
                    mazo.add(new Carta(j, i));
                }

            }
        }
    }

    public void verCartasMazo()
    {
        for (int i = 0; i < mazo.size(); i++){
            System.out.println(mazo.get(i));

        }
    }

    public void barajarCartas()
    {
        for (int posicionActual = 0; posicionActual < mazo.size(); posicionActual++){
            Carta carta1 = mazo.get(posicionActual);
            Random aleatorio = new Random();

            int cartaRandom = aleatorio.nextInt(mazo.size());

            mazo.set(posicionActual, mazo.get(cartaRandom));
            mazo.set(cartaRandom, carta1);
        }

    }
    public Carta sacarCarta()
    {
        Carta cartaADevolver = null;
        if (mazo.size() > 0){
             cartaADevolver = mazo.remove(0);
            
        }       
        return cartaADevolver;
    }
}

