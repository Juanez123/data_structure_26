import java.util.Scanner;

import com.packages.strings.*;
import com.packages.vectors.*;

public class Main {
    // Colores ANSI para la terminal
    public static final String CYAN = "\u001B[36m"; // Cian para títulos
    public static final String PURPLE = "\u001B[35m"; // Púrpura para opciones
    public static final String YELLOW = "\u001B[33m"; // Amarillo para mensajes de salida y error
    public static final String RESET = "\u001B[0m"; // Reset para volver a color normal
    public static final String BOLD = "\u001B[1m"; // Negrita
    public static final String UNDERLINE = "\u001B[4m"; // Subrayado
    public static final String WHITE = "\u001B[37m"; // Blanco para separadores
    public static final String SEPARATOR = WHITE + "--------------------------------------------------" + RESET; // Separador
                                                                                                                 // visual

    // Scanner para leer entrada del usuario
    public static Scanner input = new Scanner(System.in);

    // Método principal: muestra el menú principal y gestiona la navegación
    public static void main(String[] args) {
        String resp;
        do {
            // Mostrar menú principal con colores y separadores
            System.out.println(BOLD + CYAN + "\n        ╔══════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "        ║        Menú Principal        ║" + RESET);
            System.out.println(BOLD + CYAN + "        ╚══════════════════════════════╝\n" + RESET);
            System.out.println(PURPLE + "    [0] Salir" + RESET);
            System.out.println(PURPLE + "    [1] Cadenas de caracteres" + RESET);
            System.out.println(PURPLE + "    [2] Vectores" + RESET);
            System.out.println(SEPARATOR);
            System.out.print(BOLD + PURPLE + "\nSeleccione una opción: " + RESET);
            resp = input.nextLine();

            // Procesar la opción seleccionada
            switch (resp) {
                case "0":
                    // Salida del programa
                    System.out.println(YELLOW + BOLD + "\n¡Hasta pronto!" + RESET);
                    break;
                case "1":
                    // Ir al menú de cadenas de caracteres
                    menuString();
                    break;
                case "2":
                    // Ir al menú de vectores
                    menuVector();
                    break;
                default:
                    // Opción inválida
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
            }
        } while (!resp.equals("0")); // Repetir hasta que el usuario elija salir
    }

    // Menú de cadenas de caracteres
    public static void menuString() {
        String resp;
        StringChar str = new StringChar(); // Instancia para llamar métodos de cadenas
        do {
            // Mostrar menú de cadenas de caracteres
            System.out.println(SEPARATOR);
            System.out.println(BOLD + CYAN + "\n    ╔══════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "    ║  Menú Cadenas de Caracteres  ║" + RESET);
            System.out.println(BOLD + CYAN + "    ╚══════════════════════════════╝\n" + RESET);
            System.out.println(PURPLE + "    [0] Regresar" + RESET);
            System.out.println(PURPLE + "    [1] Ingresar texto" + RESET);
            System.out.println(PURPLE + "    [2] Mostrar texto" + RESET);
            System.out.println(PURPLE + "    [3] Longitud texto" + RESET);
            System.out.println(PURPLE + "    [4] Texto mayúscula" + RESET);
            System.out.println(PURPLE + "    [5] Texto minúscula" + RESET);
            System.out.println(PURPLE + "    [6] Palíndromo" + RESET);
            System.out.println(PURPLE + "    [7] Ejemplos cadenas" + RESET);
            System.out.println(PURPLE + "    [8] Contar carácter del usuario" + RESET);
            System.out.println(SEPARATOR);
            System.out.print(BOLD + PURPLE + "\nSeleccione una opción: " + RESET);
            resp = input.nextLine();

            // Procesar la opción seleccionada
            switch (resp) {
                case "0":
                    // Regresar al menú principal
                    break;
                case "1":
                    // Ingresar un texto
                    System.out.print(PURPLE + "Ingrese un texto: " + RESET);
                    str.setText(input.nextLine());
                    break;
                case "2":
                    // Mostrar el texto ingresado
                    System.out.println(YELLOW + BOLD + "\nTexto ingresado: " + str.getText() + RESET);
                    break;
                case "3":
                    // Mostrar la longitud del texto
                    System.out.println(YELLOW + BOLD + "\nLongitud texto: " + str.lengthString() + RESET);
                    break;
                case "4":
                    // Mostrar texto en mayúscula
                    System.out.println(YELLOW + BOLD + "\nTexto en mayúscula: " + str.upperString() + RESET);
                    break;
                case "5":
                    // Mostrar texto en minúscula
                    System.out.println(YELLOW + BOLD + "\nTexto en minúscula: " + str.lowerString() + RESET);
                    break;
                case "6":
                    // Verificar si el texto es palíndromo
                    str.palindrome();
                    break;
                case "7":
                    // Mostrar ejemplos de cadenas (solo instancia, lógica en la clase si se agrega)
                    ExampleStrings es = new ExampleStrings();
                    break;
                case "8":
                    // Contar ocurrencias de un carácter ingresado por el usuario
                    char charUser;
                    System.out.print(PURPLE + "Ingrese un carácter a contar: " + RESET);
                    // usar next() para leer el primer carácter y luego limpiar el buffer
                    charUser = input.next().charAt(0);
                    input.nextLine(); // limpiar resto de la línea
                    System.out.println(YELLOW + BOLD + "\nEl carácter '" + charUser + "' se encuentra "
                            + str.countChar(charUser) + " veces." + RESET);
                    break;
                default:
                    // Opción inválida
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
            }
        } while (!resp.equals("0")); // Repetir hasta que el usuario elija regresar
    }

    // Menú de vectores
    public static void menuVector() {

        String resp;
        int datum, pos;
        Vector v = new Vector();

        do {

            System.out.println(SEPARATOR);
            System.out.println(BOLD + CYAN + "\n    ╔══════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "    ║        Menú Vectores         ║" + RESET);
            System.out.println(BOLD + CYAN + "    ╚══════════════════════════════╝\n" + RESET);

            System.out.println(PURPLE + "    [0] Regresar" + RESET);
            System.out.println(PURPLE + "    [1] Agregar dato" + RESET);
            System.out.println(PURPLE + "    [2] Tamaño" + RESET);
            System.out.println(PURPLE + "    [3] Mostrar vector" + RESET);
            System.out.println(PURPLE + "    [4] Buscar secuencial" + RESET);

            System.out.println(SEPARATOR);

            System.out.print(BOLD + PURPLE + "\nSeleccione una opción: " + RESET);
            resp = input.nextLine();

            switch (resp) {

                case "0":
                    break;

                case "1":

                    System.out.print(PURPLE + "Ingrese el dato del vector: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();

                    if (v.getN() < v.getT()) {
                        v.addVector(datum);
                    } else {
                        System.out.println("Vector lleno");
                    }

                    break;

                case "2":

                    System.out.println(PURPLE + "Tamaño vector: " + v.getN() + RESET);

                    break;

                case "3":

                    v.showVector();

                    break;

                case "4":

                    if (v.getN() > 0) {

                        System.out.print(PURPLE + "Dato a buscar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();

                        pos = v.searchSecuencial(datum);

                        if (pos == -1) {
                            System.out.println(datum + " no se encuentra en el vector");
                        } else {
                            System.out.println(datum + " encontrado en posición " + pos);
                        }

                    } else {
                        System.out.println("Vector vacío");
                    }

                    break;

                default:
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
            }

        } while (!resp.equals("0"));
    }
}