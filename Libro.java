
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = ("");
        vecesPrestado = 0;
        esLibroDeTexto = libroDeTexto;
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
        boolean libroTexto = esLibroDeTexto;
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
        System.out.println("Veces que ha sido prestado: "+ vecesPrestado);
        if (libroTexto == true){
            System.out.println("Sí es un libro de texto");
        }
        else {
            System.out.println("No es un libro de texto");
        }
        System.out.println("#########");
    }
    
    /**
     * Devuelve detalles
     */
    public String getDetalles(){
        String elNumeroReferencia = numeroReferencia;
        String libroTexto = "";
        if (numeroReferencia == ("")){
            elNumeroReferencia = "ZZZ";
        }
        if (esLibroDeTexto == true){
            libroTexto = ("Sí");
        }
        else {
            libroTexto = ("No");
        }
        
        String devolverDetalles = ("Título: "+ titulo+ " ;Autor: " + autor+ " ;Número de páginas: "+ numeroPaginas+ ";Numero de referencia:" + elNumeroReferencia + " ;Veces prestado:" + vecesPrestado+ "; Es libro de texto:"+ libroTexto);
        return devolverDetalles;
    }
    
    /**
     * Modifica numero de referencia
     */
    public void setReferencia(String numeroDeReferencia){
        numeroReferencia = numeroDeReferencia;
        if (numeroDeReferencia.length() < 3){
            System.out.println("ERROR DE NUMERO DE REFERENCIA");
        }
    }
    
    /**
     * Devuelve el numero de referencia
     */
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    /**
     * Incrementa las veces prestado el libro
     */
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }
    
    /**
     * Devuelve las veces prestado el libro
     */
    public int getPrestar(){
        return vecesPrestado;
    }
    
    /**
     * Devuelve si es libro de texto o no
     */
    public boolean getLibroDeTexto(){
        return esLibroDeTexto;
    }
}
