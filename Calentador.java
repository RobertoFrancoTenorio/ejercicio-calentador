public class Calentador{
    private int temperatura;
    private int incremento;
    
    public Calentador()
    {
        temperatura=15;
        incremento=3;
    }
    
    public int Calentar()
    {
        if(temperatura<30){
            temperatura=temperatura+incremento;
            return(temperatura);
        }
        else
            return(0);
    }
    
    public int Enfriar()
    {   
        if(temperatura>-10){
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