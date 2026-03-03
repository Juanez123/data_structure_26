package com.packages.strings;

public class ExampleStrings 
{
    /**
     * Constructor de la clase. La intención de esta clase es
     * demostrar varios métodos y operaciones con cadenas de
     * caracteres (String) en Java. Al instanciarse, ejecuta una
     * serie de ejemplos que imprimen en pantalla los resultados.
     */
    public ExampleStrings()
    {
        // crea un objeto String utilizando el constructor de String
        String object = new String("Invocando al constructor de la clase String");
        // muestra el contenido de la cadena recién creada
        System.out.println("Cadena: " + object);

        // concatena otra cadena al final de 'object' usando concat()
        String cad1 = object.concat(". Cadena concatenada");
        System.out.println("Cadena concatenada con concat: " + cad1);

        // ejemplo de operaciones aritméticas y lógicas simples
        int a, b, c;
        a = 5;
        b = 2;
        c = 0;
        // evalúa la expresión lógica !(a > b) && a > c y almacena el resultado
        boolean x = !(a > b) && a > c;
        System.out.println("x: " + x);

        // comparación de cadenas con diferente capitalización
        String c1, c2;
        c1 = "hola";
        c2 = "Hola";
        // no usar == para comparar contenido de Strings; se muestra equalsIgnoreCase
        if (c1.equalsIgnoreCase(c2)) {
            System.out.println("Cadenas iguales");
        } else {
            System.out.println("Cadenas diferentes");
        }

        // convierte el entero b a su representación en String
        String aa = String.valueOf(b);
        System.out.println("valueOf: " + aa);

        // demostración de varios métodos de la clase String usando 'object'
        // buscar la posición de la subcadena "al" comenzando desde índice 0
        int pos = object.indexOf("al", 0);
        System.out.println("Posición de al: " + pos);
        // buscar "cando"
        pos = object.indexOf("cando", 0);
        System.out.println("Posición de cando: " + pos);
        // buscar una subcadena que no existe: devuelve -1
        pos = object.indexOf("zzz", 0);
        System.out.println("Posición de zzz: " + pos);

        // obtener caracteres en posiciones específicas
        char z = object.charAt(0);   // primer carácter
        System.out.println("z: " + z);
        z = object.charAt(14);       // carácter en índice 14
        System.out.println("z: " + z);

        // conversión entre char y códigos ASCII/Unicode
        char w = '5';
        System.out.println("ASCII(5): " + (int) w); // muestra código numérico
        System.out.println("Char(65): " + (char) 65); // muestra carácter correspondiente a 65

        // extraer una subcadena desde el índice 13 hasta el 23 (el 24 es exclusivo)
        String subString = object.substring(13, 24);
        System.out.println("Subcadena: " + subString);
    }
}