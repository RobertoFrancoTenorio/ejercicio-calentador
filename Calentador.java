public class Calentador{
    private int temperatura;
    
    public Calentador()
    {
        temperatura=15;
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