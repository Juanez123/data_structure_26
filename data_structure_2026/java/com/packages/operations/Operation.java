package com.packages.operations;

// Clase que contiene métodos para operaciones matemáticas básicas
public class Operation 
{
    // Calcula la suma de los números naturales desde 1 hasta n usando un ciclo
    public long sumNaturals(long n)
    {
        long i, s;
        s = 0;
        for (i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    // Calcula la suma de los números naturales desde 1 hasta n usando la fórmula de Gauss
    public long sumNaturalsGauss(long n)
    {
        return n * (n + 1) / 2;
    }

    // Determina si un número n es par o impar e imprime el resultado
    public void numberEvenOdd(long n)
    {
        long k, calc;
        k = 0;
        boolean sw = false;
        calc = 2 * k + 1; 
        // Busca si n es impar
        while (calc <= n && !sw) {
            if (calc == n) {
                sw = true;
            } else {
                k++;
            }
            calc = 2 * k + 1; 
        }
        // Imprime el resultado
        if (sw) {
            System.out.println(n + " es impar");
        } else {
            System.out.println(n + " es par");
        }
    }

    // Imprime las tablas de multiplicar desde 1 hasta n
    public void multiplicationTables(long n)
    {
        int i, j; // Variables para los ciclos
        i = 1; // Inicializa i
        while (i <= n) { // Recorre cada tabla
            j = 1; // Inicializa j
            while (j <= n) { // Recorre cada multiplicador
                System.out.println(i + " * " + j + " = " + i * j); // Imprime el resultado
                j++; // Siguiente multiplicador
            }
            i++; // Siguiente tabla
            System.out.println(""); // Línea en blanco entre tablas
        }
    }
    // Contador de frecuencias: CF = 4n ^ 2 + 6n + 3
    // Orden de magnitud Big O: O(n ^ 2) (Cuadrático)

    // Imprime todas las combinaciones posibles de hora:minuto:segundo en formato reloj digital
    public void clock()
    {
        int m, n, i, j, k; // Variables para ciclos
        m = 24; // Horas
        n = 60; // Minutos y segundos
        i = 0; // Inicializa hora
        while (i < m) { // Recorre horas
            j = 0;
            while (j < n) { // Recorre minutos
                k = 0; // Inicializa segundos
                while (k < n) { // Recorre segundos
                    System.out.println(i + ":" + j + ":" + k); // Imprime la hora
                    k++; // Siguiente segundo
                }
                j++; // Siguiente minuto
            }
            i++; // Siguiente hora
        }
         
        // CF = 4 mn^2 + 5mn + 4m + 5
        // O(mn^2).  Si m = n, entonces nn^2 = n^3, por tanto: O(n^3)
    }
}
