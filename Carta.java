
/**
 * Write a description of class Carta here.
 * 
 * @author (Cristian) 
 * @version (02.02.17)
 */
public class Carta
{
    //Valor de la carta; de 1 a 7 o de 10 a 12
    private int valorCarta;
    //Valor del palo; 0 es oros , 1 es copas, 2 es espadas y 3 es bastos
    private int paloCarta;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valorCarta, int paloCarta)
    {
        this.paloCarta = paloCarta;
        this.valorCarta = valorCarta;
    }

    public int getValorCarta(){
        return valorCarta;

    }

    public int getPaloCarta(){
        return paloCarta;

    }

    public String toString(){
        String textoPalo = " ";
        String textoValor = Integer.toString(valorCarta);
        String textoADevolver = " ";
        switch(paloCarta){
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
        switch(valorCarta){
            case 1:
            textoValor = "as";
            break;
            case 10:
            textoValor = "sota";
            break;
            case 11:
            textoValor = "caballo";
            break;
            case 12:
            textoValor = "rey";
            break;
        }

        textoADevolver = textoValor  + " de " + textoPalo;
        return textoADevolver;

    }

    public boolean ganaA (Carta cartaAComparar, int paloQuePinta)
    {
        boolean gana = false;
        if(paloCarta == cartaAComparar.getPaloCarta())
        {
            //En caso de que tengan el mismo palo
            if (getPosicionEscalaTute() > cartaAComparar.getPosicionEscalaTute())
            {
                gana = true;
            }
        }     
        else {
            //En caso de que tengan distinto palo
            if (cartaAComparar.getPaloCarta() != paloQuePinta)
            {
                gana = true;
            }         
        }   
        return gana;
        }
        
   public int getPosicionEscalaTute()
   {
       int posicion = valorCarta;
       
       if(valorCarta == 3){
           posicion = 13;
        }
        else if(valorCarta == 1){
            posicion = 14;
        }
       return posicion;
    }
}

