public class ObjLibro {
    private String Titulo;
    private String Autor;
    private int AnioPublicacion;
    private String Isbn;
    
    public ObjLibro() {
    }

    public ObjLibro(String titulo, String autor, int anioPublicacion, String isbn) {
        Titulo = titulo;
        Autor = autor;
        AnioPublicacion = anioPublicacion;
        Isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnioPublicacion() {
        return AnioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        AnioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    
}
 