package com.packages.arrays;

// Clase que representa un vector (arreglo dinámico sobre un arreglo fijo) y operaciones comunes
public class Vector 
{
    // Tamaño máximo del vector (capacidad del arreglo subyacente)
    private final int T = 100;

    // n mantiene la cantidad actual de elementos usados en el vector
    private int n;

    // Arreglo subyacente donde se almacenan los datos
    private int vec[] = new int[T];

    // Constructor: inicia el vector vacío (n = 0)
    public Vector()
    {
        n = 0;
    }

    // Devuelve la capacidad máxima del vector
    public int getT()
    {
        return T;
    }

    // Devuelve el número actual de elementos en el vector
    public int getN() 
    {
        return n;
    }

    // Permite establecer manualmente el tamaño n (use con precaución)
    public void setN(int n) 
    {
        this.n = n;
    }

    // Devuelve referencia al arreglo subyacente
    public int[] getVec() 
    {
        return vec;
    }

    // Reemplaza el arreglo subyacente (usar con precaución)
    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    // Agrega un elemento al final del vector (si hay capacidad)
    public void addVector(int datum)
    {
        // Inserta en la posición n y aumenta el contador
        vec[n] = datum;
        n++;
    }

    // Muestra los elementos del vector separados por ' | '
    public void showVector()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | ");
        }
    }


    // Búsqueda secuencial: devuelve la posición del dato si se encuentra, o -1 si no
    public int searchSecuencial(int datum)
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (i < n && pos == -1) {
            if (vec[i] == datum) {
                pos = i; // encontrado
            } else {
                i++; // continuar búsqueda
            }
        }
        return pos;
    }
       
    // Actualiza el elemento en la posición indicada con un nuevo dato
    public void updateVector(int datum, int pos)
    {
        // Actualiza el elemento en la posición indicada
        vec[pos] = datum;
    }

    // Elimina el elemento en la posición indicada y desplaza hacia la izquierda
    public void deleteVector(int pos)
    {
        for (int i = pos; i < n - 1; i++) {
            vec[i] = vec[i + 1];
        }
        n--;
    }

    // Inserta un dato en la posición indicada desplazando los elementos a la derecha
    public void insertVector(int pos, int datum)
    {
        for (int i = n; i > pos; i--) {
            vec[i] = vec[i - 1];
        }
        vec[pos] = datum;
        n++;
    }


    // Ordenamiento por burbuja (simple, ordena ascendentemente)
    public void sortBubble()
    {
        int aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vec[i] > vec[j]) {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }

    // Suma de todos los elementos del vector
    public int sumVector()
    {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + vec[i];
        }
        return s;
    }

    // Producto de todos los elementos del vector
    public int productVector()
    {
        int p = 1;
        for (int i = 0; i < n; i++) {
            p = p * vec[i];
        }
        return p;
    }

    // Promedio de los elementos (se castea a double para precisión)
    public double avgVector()
    {
        return (double) sumVector() / n;
    }

    // Retorna el mayor elemento del vector (asume n > 0)
    public int maxVector()
    {
        int i, m;
        m = vec[0]; // Supuesto: el mayor elemento está en la primera posición
        for (i = 1; i < n; i++) {
            if (vec[i] > m) {
                m = vec[i];
            }
        }
        return m;
    }

    // Retorna el menor elemento del vector (asume n > 0)
    public int minVector()
    {
        int i, m;
        m = vec[0]; // Supuesto: el menor elemento está en la primera posición
        for (i = 1; i < n; i++) {
            if (vec[i] < m) {
                m = vec[i];
            }
        }
        return m;
    }

    // Cuenta cuántos elementos en posiciones pares (0,2,4,...) son impares
    public int totalOddPositionEven()
    {
        int i, c;
        c = 0;
        for (i = 0; i < n; i += 2) {
            if (vec[i] % 2 == 1) {
                c++;
            }
        }
        return c;
    }

    // Calcula la varianza muestral: suma de (xi - media)^2 dividido entre n-1
    public double variance()
    {
        double s = 0;
        double mean = avgVector();
        for (int i = 0; i < n; i++) {
            s = s + Math.pow(vec[i] - mean, 2);
        }
        return s / (n - 1);
    }

    // Desviación estándar: raíz cuadrada de la varianza
    public double desviation()
    {
        return Math.sqrt(variance());
    }

    // Intercambia elementos simétricos desde los extremos hacia el centro
    public void interchange()
    {
        int aux;
        for (int i = 0; i < n / 2; i++) {
            aux = vec[i];
            vec[i] = vec[n - i - 1];
            vec[n - i - 1] = aux;
        }
    }
       
}
