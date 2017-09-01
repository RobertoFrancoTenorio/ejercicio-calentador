public class Calentador{
    private int temperatura;
    private int incremento;
    private int max;
    private int min;
    
    public Calentador(int maximo, int minimo)
    {
        temperatura=15;
        incremento=0;
        max=maximo;
        min=minimo;
    }
    
    /**
     * Metodo encargada de definir el incremento
     * @param Recibe el incremento definido por el usuario
     */
    public void modificaIncremento(int incre)
    {
        if (incre>=max || incre<=min){
            incremento=0;
        }
        if(incre<0){
            incremento=0;
        }   
        else
            incremento=incre;
    }
    
    /**
     * Metodo que se encarga de elevar la temperatura   
     * @return Nos muestra la temperatura final si pudo ser aumentada y 0 si 
     * no pudo aumentarse
     */
    public int Calentar()
    {
        if(temperatura<max){
            temperatura=temperatura+incremento;
            return(temperatura);
        }
        else
            return(0);
    }
    
    public int Enfriar()
    {   
        if(temperatura>min){
            temperatura=temperatura-incremento;
            return(temperatura);
        }
        else
            return(0);
    }
    
    /**
     * Nos brinda la informacion de la temperatura
     */
    public void Chequeo()
    {
        System.out.println("La temperatura es: ");
        System.out.println(temperatura);
    }
}