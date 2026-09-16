import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        Stack<ObjLibro> libro = new Stack<>();
        boolean continuar = true;
        System.out.println();
        System.out.println("=== Biblioteca Estructura de Datos ===");

        while (continuar) {
            System.out.println();
            System.out.println("Ingrese una opción");
            System.out.println("1) Registrar libro");
            System.out.println("2) Mostrar registros");
            System.out.println("3) Mostrar último libro registrado");
            System.out.println("4) Eliminar último libro registrado");
            System.out.println("5) Eliminar por ISBN");
            System.out.println("6) Salir");
            System.out.print("Opción: ");
            int opt = m.ValidarEntero(sc);
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.println();
                    libro = m.RegistrarLibros(libro, sc, m);
                    break;
                case 2:
                    System.out.println();
                    m.MostrarRegistros(libro);
                    break;
                case 3:
                    System.out.println();
                    m.UltimoRegistro(libro);
                    break;
                case 4:
                    libro = m.EliminarTope(libro);
                    break;
                case 5:
                    libro = m.EliminarRegistro(libro, sc, m);
                    break;
                case 6:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "¡Saliendo del sistema!");
                    break;
                default:
                    JOptionPane.showConfirmDialog(null, "Opción inválida. intente nuevamente");
                    break;
            }
        }
    }
}

