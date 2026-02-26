package com.packages.operations;

import java.util.Scanner;

// Clase que representa una persona y operaciones relacionadas a grupos
public class Person 
{
    // Atributos de la persona
    private String name;
    private int age;
    private double height;
    // Scanner para leer datos de usuario
    public static Scanner input = new Scanner(System.in);

    // Constructor: inicializa los atributos
    public Person()
    {
        name = "";
        age = 0;
        height = 0;
    }

    // Métodos getter y setter para los atributos
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    // Método para determinar qué grupo (mujeres/hombres) es más longevo
    public void oldGroupPerson()
    {
        int m, n, i, sumAge;                    // m: mujeres, n: hombres, i: contador, sumAge: suma edades
        double avgW, avgM;                      // avgW: promedio mujeres, avgM: promedio hombres
        System.out.print("Número mujeres: "); // Solicita cantidad de mujeres
        m = input.nextInt();                    // Lee cantidad de mujeres
        System.out.print("Número hombres: "); // Solicita cantidad de hombres
        n = input.nextInt();                    // Lee cantidad de hombres
        i = 1;                                  // Inicializa contador
        sumAge = 0;                             // Inicializa suma de edades
        // Lee edades de mujeres
        while (i <= m) {
            System.out.print("Edad mujer " + i + ": ");
            this.age = input.nextInt();
            sumAge += this.age;
            i++;
        }
        avgW = sumAge / m;                      // Calcula promedio mujeres
        
        i = 1;                                  // Reinicia contador
        sumAge = 0;                             // Reinicia suma de edades
        // Lee edades de hombres
        while (i <= n) {
            System.out.print("Edad hombre " + i + ": ");
            this.age = input.nextInt();
            sumAge += this.age;
            i++;
        }
        avgM = sumAge / m;                      // Calcula promedio hombres (¡OJO! debería ser n, no m)
        // Compara promedios y muestra el grupo más longevo
        if (avgW > avgM) {
            System.out.println("Grupo más longevo: mujeres");
        } else if (avgW < avgM) {
            System.out.println("Grupo más longevo: hombres");
        } else {
            System.out.println("Grupo más longevo: coinciden en longevidad");
        }
        System.out.println("Promedio general: " + (avgW + avgM) / 2); // Muestra promedio general
        
    }

    // Contador de frecuencias: CF = 6m + 6n + 16
    // Orden de magnitud : O(m + n)
    
}
