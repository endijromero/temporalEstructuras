public class Principal {

  public static void main(String[] args) {
    Libro libro1 = new Libro();

    Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 432, "978-8437604947");

    libro1.mostrarInfo();
    libro2.mostrarInfo();

    libro2.setNumeroPaginas(450);

    System.out.println("El título del libro2 es: " + libro2.getTitulo());
    System.out.println("");
    System.out.println("Total de libros creados: " + Libro.getTotalLibros());
  }
}
