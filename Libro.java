
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    //Atributos
    private String issn;
    private String titulo;
    private String editorial;
    private String autor;
    private int publicacion;
    
    //construtor
    public Libro(String issn, String titulo, String editorial, String autor, int publicacion)
    {
        // initialise instance variables
        this.issn = issn;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.editorial = editorial;
        
    }
    //getters & setters
    
    public String getIssn()
    {
        return issn;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public String getAutor()
    {
        return autor;
    }
    
    public int getPublicacion()
    {
        return publicacion;
    }
    
    public String getEditorial()
    {
        return editorial;
    }
    
    public void setIssn(String issn){
        this.issn = issn;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPublicacion(int publicacion){
        this.publicacion = publicacion;
    }
    
}
