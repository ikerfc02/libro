
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = ("");
    }
    
    /**
     * Devuelve autor
     */
    public String getAutor(){
        return autor;
    }
    
    /**
     * Devuelve titulo
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * Imprime nombre autor
     */
    public void imprimeAutor(){
        System.out.println(autor);
    }
    
    /**
     * Imprime titulo libro
     */
    public void imprimeTitulo(){
        System.out.println(titulo);
    }
    
    /**
     * Devuelve el numero de paginas
     */
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    /**
     * Imprime los detalles del libro
     */
    
    public void imprimirDetalles(){
        System.out.println("#########");
        System.out.println("Título: "+ titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: "+ numeroPaginas);
        if (numeroReferencia != ("")){
            System.out.println("Número de referencia: "+numeroReferencia);
        }
        else {
            System.out.println("Número de referencia: ZZZ");
        }
        System.out.println("#########");
    }
    
    /**
     * Devuelve detalles
     */
    public String getDetalles(){
        String devolverDetalles = ("Título: "+ titulo+ " ;Autor: " + autor+ " ;Número de páginas: "+ numeroPaginas+ "Numero de referencia" + numeroReferencia);
        return devolverDetalles;
    }
    
    /**
     * Modifica numero de referencia
     */
    public void setReferencia(String numeroDeReferencia){
        numeroReferencia = numeroDeReferencia;
        if (numeroReferencia.length() < 3){
            System.out.println("ERROR DE NUMERO DE REFERENCIA");
        }
        else {
            numeroReferencia = numeroDeReferencia;
        }
    }
    
    /**
     * Devuelve el numero de referencia
     */
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
}
