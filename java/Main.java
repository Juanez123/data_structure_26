import java.util.Scanner;

import com.packages.strings.*;
import com.packages.arrays.*;

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
            System.out.println(PURPLE + "    [3] Matrices" + RESET);
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
                case "3":
                    // Ir al menú de matrices
                    menuMatrix();
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
            System.out.println(PURPLE + "    [5] Modificar" + RESET);
            System.out.println(PURPLE + "    [6] Eliminar" + RESET);
            System.out.println(PURPLE + "    [7] Insertar" + RESET);
            System.out.println(PURPLE + "    [8] Ordenar (burbuja)" + RESET);
            System.out.println(PURPLE + "    [9] Suma datos" + RESET);
            System.out.println(PURPLE + "    [10] Promedio datos" + RESET);
            System.out.println(PURPLE + "    [11] Mayor dato" + RESET);
            System.out.println(PURPLE + "    [12] Menor dato" + RESET);
            System.out.println(PURPLE + "    [13] Varianza" + RESET);
            System.out.println(PURPLE + "    [14] Desviación" + RESET);
            System.out.println(PURPLE + "    [15] Intercambio" + RESET);

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
                        System.out.println(YELLOW + BOLD + "\nVector lleno" + RESET);
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
                            System.out.println(YELLOW + BOLD + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            System.out.println(YELLOW + BOLD + datum + " encontrado en posición " + pos + RESET);
                        }

                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }

                    break;

                case "5":
                    // Modificar un dato existente: buscar y actualizar
                    if (v.getN() > 0) {
                        System.out.print(PURPLE + "Dato a modificar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(YELLOW + BOLD + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            System.out.print(PURPLE + "Nuevo dato: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            v.updateVector(datum, pos);
                            System.out.println(YELLOW + BOLD + "Dato actualizado correctamente" + RESET);
                        }
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }
                    break;

                case "6":
                    // Eliminar un dato: buscar y borrar por posición
                    if (v.getN() > 0) {
                        System.out.print(PURPLE + "Dato a eliminar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(YELLOW + BOLD + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            v.deleteVector(pos);
                            System.out.println(YELLOW + BOLD + "Dato eliminado correctamente" + RESET);
                        }
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }
                    break;

                case "7":
                    // Insertar un dato antes de una posición referencia
                    if (v.getN() < v.getT()) {
                        System.out.print(PURPLE + "Dato referencia: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(YELLOW + BOLD + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            System.out.print(PURPLE + "Dato a insertar: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            v.insertVector(pos, datum);
                            System.out.println(YELLOW + BOLD + "Dato insertado correctamente" + RESET);
                        }
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector lleno" + RESET);
                    }
                    break;

                case "8":
                    // Ordenar por burbuja
                    if (v.getN() > 0) {
                        v.sortBubble();
                        System.out.println(YELLOW + BOLD + "Vector ordenado correctamente" + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }
                    break;

                case "9":
                    // Suma de los datos del vector
                    if (v.getN() > 0) {
                        System.out.println(YELLOW + BOLD + "Suma datos vector: " + v.sumVector() + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }
                    break;

                case "10":
                    // Promedio de los datos
                    if (v.getN() > 0) {
                        System.out.println(YELLOW + BOLD + "Promedio datos vector: " + v.avgVector() + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }
                    break;

                case "11":
                    // Mayor dato
                    if (v.getN() > 0) {
                        System.out.println(YELLOW + BOLD + "Mayor dato vector: " + v.maxVector() + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }
                    break;

                case "12":
                    // Menor dato
                    if (v.getN() > 0) {
                        System.out.println(YELLOW + BOLD + "Menor dato vector: " + v.minVector() + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "Vector vacío" + RESET);
                    }
                    break;

                case "13":
                    // Varianza (se requiere al menos 2 datos)
                    if (v.getN() > 1) {
                        System.out.println(YELLOW + BOLD + "Varianza: " + v.variance() + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "No hay datos suficientes" + RESET);
                    }
                    break;

                case "14":
                    // Desviación estándar (se requiere al menos 2 datos)
                    if (v.getN() > 1) {
                        System.out.println(YELLOW + BOLD + "Desviación estándar: " + v.desviation() + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "No hay datos suficientes" + RESET);
                    }
                    break;

                case "15":
                    // Intercambiar elementos según la lógica de la clase Vector
                    if (v.getN() > 0) {
                        v.interchange();
                        System.out.println(YELLOW + BOLD + "Se intercambiaron los datos del vector" + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "No hay datos" + RESET);
                    }
                    break;

                default:
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
            }

        } while (!resp.equals("0"));
    }

    // Menú de matrices
    public static void menuMatrix() {
        String resp;
        int rows, cols;
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        rows = 0;
        cols = 0;

        do {
            System.out.println(SEPARATOR);
            System.out.println(BOLD + CYAN + "\n    ╔══════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "    ║         Menú Matrices        ║" + RESET);
            System.out.println(BOLD + CYAN + "    ╚══════════════════════════════╝\n" + RESET);

            System.out.println(PURPLE + "    [0] Regresar" + RESET);
            System.out.println(PURPLE + "    [1] Crear matriz" + RESET);
            System.out.println(PURPLE + "    [2] Tamaño (orden)" + RESET);
            System.out.println(PURPLE + "    [3] Mostrar" + RESET);
            System.out.println(PURPLE + "    [4] Suma matrices" + RESET);
            System.out.println(PURPLE + "    [5] Diagonal principal" + RESET);
            System.out.println(PURPLE + "    [6] Diagonal secundaria" + RESET);
            System.out.println(PURPLE + "    [7] Triángulo arriba" + RESET);
            System.out.println(PURPLE + "    [8] Triángulo izquierdo" + RESET);
            System.out.println(PURPLE + "    [9] Triángulo derecho" + RESET);
            System.out.println(SEPARATOR);

            System.out.print(BOLD + PURPLE + "\nSeleccione una opción: " + RESET);
            resp = input.nextLine();

            switch (resp) {
                case "0":
                    // Regresar al menú anterior
                    break;
                case "1":
                    // Crear matriz solicitando filas y columnas
                    System.out.print(PURPLE + "Número filas: " + RESET);
                    rows = input.nextInt();
                    input.nextLine();
                    System.out.print(PURPLE + "Número columnas: " + RESET);
                    cols = input.nextInt();
                    input.nextLine();
                    if (rows > 0 && rows <= 50 && cols > 0 && cols <= 50) {
                        matrix.setM(rows);
                        matrix.setN(cols);
                        matrix.createMatrix();
                        System.out.println(YELLOW + BOLD + "Matriz creada correctamente" + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "Tamaño no válido para la matriz" + RESET);
                    }
                    break;
                case "2":
                    // Mostrar tamaño de la matriz
                    System.out.println(YELLOW + BOLD + "Tamaño matriz: " + matrix.getM() + " x " + matrix.getN() + RESET);
                    break;
                case "3":
                    // Mostrar matriz actual
                    matrix.showMatrix(matrix.getMat());
                    break;
                case "4":
                    // Sumar dos matrices (se crea una segunda matriz)
                    matrix2.setM(rows);
                    matrix2.setN(cols);
                    matrix2.createMatrix();
                    matrix.sumMatrix(matrix.getMat(), matrix2.getMat());
                    matrix.showMatrix(matrix.getMat());
                    System.out.println();
                    matrix2.showMatrix(matrix2.getMat());
                    System.out.println();
                    matrix.showMatrix(matrix.getMatSum());
                    break;
                case "5":
                    // Diagonal principal (requiere matriz cuadrada)
                    if (matrix.getM() == matrix.getN() && matrix.getM() > 1) {
                        matrix.mainDiagonal();
                    } else {
                        System.out.println(YELLOW + BOLD + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "6":
                    // Diagonal secundaria (requiere matriz cuadrada)
                    if (matrix.getM() == matrix.getN() && matrix.getM() > 1) {
                        matrix.secondaryDiagonal();
                    } else {
                        System.out.println(YELLOW + BOLD + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "7":
                    // Triángulo arriba
                    if (matrix.getM() > 1 && matrix.getN() > 1) {
                        matrix.upTriangle();
                    } else {
                        System.out.println(YELLOW + BOLD + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "8":
                    // Triángulo izquierdo
                    if (matrix.getM() > 1 && matrix.getN() > 1) {
                        matrix.leftTriangle();
                    } else {
                        System.out.println(YELLOW + BOLD + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "9":
                    // Triángulo derecho
                    if (matrix.getM() > 1 && matrix.getN() > 1) {
                        matrix.rightTriangle();
                    } else {
                        System.out.println(YELLOW + BOLD + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                default:
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
                    break;
            }

        } while (!resp.equals("0"));
    }

}