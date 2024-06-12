
/**
 * Write a description of class Prestamo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prestamo
{
    // instance variables - replace the example below with your own
    private Fecha fechaPrestamo;
    private Fecha fechaEvolution;
    private Usuario usuario;

    public Prestamo(){}
    
    public Prestamo(Fecha fechaPrestamo)
    {
        // initialise instance variables
        this.fechaPrestamo = fechaPrestamo;
    }
    
    public Fecha getFechaPrestamo(){
        return fechaPrestamo;
    }
    
    public void setFechaPrestamo(Fecha newFechaPrestamo){
        this.fechaPrestamo = newFechaPrestamo;
    }
    
    public void calcularFechaDevolucion(Usuario usuario, Libro libro){
        
    }
    
}
