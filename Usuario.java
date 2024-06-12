
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    //Atributos
    private int codigo;
    private String nombre;
    private String direccion;
    private String email;
    
    //construtor
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(int codigo, String nombre, String direccion, String email)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        
    }

    //getters & setters
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getEmail(){
        return email;
    }
    
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    //operational methods
    public void mostrarInfo(){
        System.out.println("El nombre del usuario es: " + getNombre());
    }
    
    //public int cantidadPrestamos(){
        //cantidadP= 0;
        //return cantidadP;}
    
}
