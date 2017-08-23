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
        temperatura=temperatura+5;
        return(temperatura);
    }
    
    public int Enfriar()
    {
        temperatura=temperatura-5;
        return(temperatura);
    }
    
    public void Chequeo()
    {
        System.out.println("La temperatura es: ");
        System.out.println(temperatura);
    }
}