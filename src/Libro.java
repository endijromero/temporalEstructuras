
public class Libro {
// Atributos

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private final String isbn;
    private static int contadorLibros = 0;
// Constructor por defecto

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
        this.isbn = "000-0000000000";
        contadorLibros++;
    }
// Constructor parametrizado

    public Libro(String titulo, String autor, int numeroPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn; // Atributo final se inicializa aquí
        contadorLibros++;
    }
// Métodos getters, setters y de comportamiento

    public String getTitulo() {
        return titulo;
    }

    public void setNumeroPaginas(int paginas) {
        this.numeroPaginas
                = paginas;
    }

    public void mostrarInfo() {
        System.out.println("'" + titulo + "' por " + autor + " (" + numeroPaginas + "páginas). ISBN: " + isbn);
    }

    public static int getTotalLibros() {
        return contadorLibros;
    }
}
