import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<ObjLibro> RegistrarLibros(Stack<ObjLibro> biblioteca, Scanner sc, Metodos m) {
        ObjLibro l = new ObjLibro();
        System.out.print("Ingrese el título del libro: ");
        l.setTitulo(sc.nextLine());
        System.out.print("Ingrese el autor: ");
        l.setAutor(sc.nextLine());
        System.out.print("Ingrese el año de publicación: ");
        l.setAnioPublicacion(m.ValidarEntero(sc));
        sc.nextLine();
        System.out.print("Ingrese el codigo ISBN: ");
        l.setIsbn(sc.next());
        biblioteca.push(l);
        return biblioteca;
    }

    public void MostrarRegistros(Stack<ObjLibro> biblioteca) {
        for (ObjLibro l : biblioteca) {
            System.out.println();
            System.out.println("Titulo: " + l.getTitulo());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Año: " + l.getAnioPublicacion());
            System.out.println("ISBN: " + l.getIsbn());
            System.out.println("-----------------");
        }
    }

    public Stack<ObjLibro> EliminarTope(Stack<ObjLibro> biblioteca) {
        if (biblioteca.isEmpty()) {
            System.out.println();
            System.out.println("¡No hay libros registrados!");
            return biblioteca;
        }
        biblioteca.pop();
        System.out.println();
        System.out.println("¡Registro eliminado exitosamente!");
        return biblioteca;
    }

    public void UltimoRegistro(Stack<ObjLibro> biblioteca) {
        if (biblioteca.isEmpty()) {
            System.out.println();
            System.out.println("¡No hay libros registrados!");
            return;
        }
        ObjLibro l = biblioteca.peek();
        System.out.println();
        System.out.println("=== Último Libro Registrado ===");
        System.out.println();
        System.out.println("Titulo:  " + l.getTitulo());
        System.out.println("Autor:   " + l.getAutor());
        System.out.println("Año: " + l.getAnioPublicacion());
        System.out.println("ISBN: " + l.getIsbn());

    }

    public Stack<ObjLibro> EliminarRegistro(Stack<ObjLibro> biblioteca, Scanner sc, Metodos m) {
        System.out.println("Ingrese el ISBN del libro a eliminar");
        String isbn = sc.nextLine();
        Stack<ObjLibro> bibliotecaaux = new Stack<>();
        boolean encontrado = false;
        while (!biblioteca.isEmpty()) {
            ObjLibro l = biblioteca.pop();
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("¡Registro Eliminado!");
                encontrado = true;
            } else {
                bibliotecaaux.push(l);
            }
        }
        if (!encontrado) {
            System.out.println("ISBN sin registros");
        }
        while (!bibliotecaaux.isEmpty()) {
            biblioteca.push(bibliotecaaux.pop());
        }
        return biblioteca;
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("¡Por favor ingresar dato numérico entero!");
            sc.next();
        }
        return sc.nextInt();
    }
}

    

