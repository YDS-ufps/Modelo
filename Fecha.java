
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor for objects of class Fecha
     */
    public Fecha(int dia, int mes, int anio)
    {
        // initialise instance variables
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }

    
}
