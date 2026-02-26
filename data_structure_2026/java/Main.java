import java.util.Scanner;

import com.packages.operations.*;

public class Main
{
    // Colores ANSI para la terminal
    public static final String CYAN = "\u001B[36m";      // Cian para títulos
    public static final String PURPLE = "\u001B[35m";    // Púrpura para opciones
    public static final String YELLOW = "\u001B[33m";    // Amarillo para mensajes de salida y error
    public static final String RESET = "\u001B[0m";      // Reset para volver a color normal
    public static final String BOLD = "\u001B[1m";       // Negrita
    public static final String UNDERLINE = "\u001B[4m";  // Subrayado
    public static final String WHITE = "\u001B[37m";     // Blanco para separadores
    public static final String SEPARATOR = WHITE + "--------------------------------------------------" + RESET; // Separador visual

    // Scanner para leer entrada del usuario
    public static Scanner input = new Scanner(System.in);

    // Método principal: muestra el menú principal y gestiona la navegación
    public static void main(String [] args)
    {
        String option;
        do {
            // Mostrar menú principal con colores y separadores
            System.out.println(SEPARATOR);
            System.out.println(BOLD + CYAN + "\n        ╔══════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "        ║        Menú Principal        ║" + RESET);
            System.out.println(BOLD + CYAN + "        ╚══════════════════════════════╝\n" + RESET);
            System.out.println(PURPLE + "    [0] Salir" + RESET);
            System.out.println(PURPLE + "    [1] Operaciones básicas" + RESET);
            System.out.println(PURPLE + "    [2] Personas" + RESET);
            System.out.println(PURPLE + "    [3] Vectores" + RESET);
            System.out.println(SEPARATOR);
            System.out.print(BOLD + PURPLE + "\nSeleccione una opción: " + RESET);
            option = input.nextLine();

            // Procesar la opción seleccionada
            switch (option) {
                case "0":
                    // Salida del programa
                    System.out.println(YELLOW + BOLD + "\n¡Hasta pronto!" + RESET);
                    break;
                case "1":
                    // Ir al menú de operaciones
                    menuOperations();
                    break;
                case "2":
                    // Ir al menú de personas
                    menuPersons();
                    break;
                case "3":
                    // Opción de vectores (no implementada)
                    // System.out.println("Hasta pronto");
                    break;
                default: 
                    // Opción inválida
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
            }
        } while (!option.equals("0")); // Repetir hasta que el usuario elija salir
    }

    // Menú de operaciones matemáticas
    public static void menuOperations()
    {
        String option;
        long n;
        Operation oper = new Operation(); // Instancia para llamar métodos de operaciones
        do {
            // Mostrar menú de operaciones
            System.out.println(SEPARATOR);
            System.out.println(BOLD + CYAN + "\n      ╔══════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "      ║      Menú de Operaciones     ║" + RESET);
            System.out.println(BOLD + CYAN + "      ╚══════════════════════════════╝\n" + RESET);
            System.out.println(PURPLE + "    [0] Regresar" + RESET);
            System.out.println(PURPLE + "    [1] Suma naturales" + RESET);
            System.out.println(PURPLE + "    [2] Suma naturales Gauss" + RESET);
            System.out.println(PURPLE + "    [3] Pares e impares" + RESET);
            System.out.println(PURPLE + "    [4] Tablas de multiplicar" + RESET);
            System.out.println(PURPLE + "    [5] Reloj" + RESET);
            System.out.println(SEPARATOR);
            System.out.print(BOLD + PURPLE + "\nSeleccione una opción: " + RESET);
            option = input.nextLine();

            // Procesar la opción seleccionada
            switch (option) {
                case "0":
                    // Regresar al menú principal
                    break;
                case "1":
                    // Suma de números naturales
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    n = input.nextInt();
                    input.nextLine();
                    if (n > 0) {
                        System.out.println(YELLOW + BOLD + "\nSuma de 1 a " + n + ": " + oper.sumNaturals(n) + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "\nValor de n no válido" + RESET);
                    }
                    break;
                case "2":
                    // Suma de números naturales usando fórmula de Gauss
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    n = input.nextInt();
                    input.nextLine();
                    if (n > 0) {
                        System.out.println(YELLOW + BOLD + "\nSuma de 1 a " + n + ": " + oper.sumNaturalsGauss(n) + RESET);
                    } else {
                        System.out.println(YELLOW + BOLD + "\nValor de n no válido" + RESET);
                    }
                    break;
                case "3":
                    // Determinar si n es par o impar
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    n = input.nextInt();
                    input.nextLine();
                    if (n >= 0) {
                        oper.numberEvenOdd(n);
                    } else {
                        System.out.println(YELLOW + BOLD + "\nValor de n no válido" + RESET);
                    }
                    break;
                case "4":
                    // Mostrar tablas de multiplicar hasta n
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    n = input.nextLong();
                    if (n > 0) {
                        oper.multiplicationTables(n);
                    } else {
                        System.out.println(YELLOW + BOLD + "\nValor de n no válido" + RESET);
                    }
                    break;
                case "5":
                    // Mostrar reloj digital (todas las combinaciones de hora:minuto:segundo)
                    oper.clock();
                    break;
                default: 
                    // Opción inválida
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
            }
        } while (!option.equals("0")); // Repetir hasta que el usuario elija regresar
    }

    // Menú de personas
    public static void menuPersons()
    {
        String option;
        Person per = new Person(); // Instancia para llamar métodos de personas
        do {
            // Mostrar menú de personas
            System.out.println(SEPARATOR);
            System.out.println(BOLD + CYAN + "\n      ╔══════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "      ║        Menú Personas         ║" + RESET);
            System.out.println(BOLD + CYAN + "      ╚══════════════════════════════╝\n" + RESET);
            System.out.println(PURPLE + "    [0] Regresar" + RESET);
            System.out.println(PURPLE + "    [1] Grupo más longevo" + RESET);
            System.out.println(SEPARATOR);
            System.out.print(BOLD + PURPLE + "\nSeleccione una opción: " + RESET);
            option = input.nextLine();

            // Procesar la opción seleccionada
            switch (option) {
                case "0":
                    // Regresar al menú principal
                    break;
                case "1":
                    // Determinar el grupo más longevo (mujeres/hombres)
                    per.oldGroupPerson();
                    break;
                default: 
                    // Opción inválida
                    System.out.println(YELLOW + BOLD + "\nOpción no válida" + RESET);
            }
        } while (!option.equals("0")); // Repetir hasta que el usuario elija regresar
    }
}