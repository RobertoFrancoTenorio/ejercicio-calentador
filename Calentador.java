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
    
    public void modificaIncremento(int incre)
    {
        incremento=incre;
    }
    
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
    
    public void Chequeo()
    {
        System.out.println("La temperatura es: ");
        System.out.println(temperatura);
    }
}