package com.packages.vectors;

public class Vector 
{
    private final int T = 100;
    private int n;
    private int vec[] = new int[T];

    public Vector()
    {
        n = 0;
    }

    public int getT()
    {
        return T;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public int[] getVec() 
    {
        return vec;
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public void addVector(int datum)
    {
        vec[n] = datum;
        n++;
    }

    public void showVector()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | ");
        }
    }


    public int searchSecuencial(int datum)
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (i < n && pos == -1) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
       
    // ...Métodos añadidos integrados desde la versión externa, adaptados al estilo y comentarios del proyecto...

    public void updateVector(int datum, int pos)
    {
        // Actualiza el elemento en la posición indicada
        vec[pos] = datum;
    }

    public void deleteVector(int pos)
    {
        // Elimina el elemento en la posición indicada y desplaza los siguientes
        for (int i = pos; i < n - 1; i++) {
            vec[i] = vec[i + 1];
        }
        n--;
    }

    public void insertVector(int pos, int datum)
    {
        // Inserta un dato en la posición indicada desplazando a la derecha
        for (int i = n; i > pos; i--) {
            vec[i] = vec[i - 1];
        }
        vec[pos] = datum;
        n++;
    }


    public void sortBubble()
    {
        // Ordenamiento por burbuja (ascendente)
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

    public int sumVector()
    {
        // Suma de todos los elementos del vector
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + vec[i];
        }
        return s;
    }

    public int productVector()
    {
        // Producto de todos los elementos del vector
        int p = 1;
        for (int i = 0; i < n; i++) {
            p = p * vec[i];
        }
        return p;
    }

    public double avgVector()
    {
        // Promedio de los elementos (casteo a double para precisión)
        return (double) sumVector() / n;
    }

    public int maxVector()
    {
        // Retorna el mayor elemento del vector
        int i, m;
        m = vec[0]; // Supuesto: el mayor elemento está en la primera posición
        for (i = 1; i < n; i++) {
            if (vec[i] > m) {
                m = vec[i];
            }
        }
        return m;
    }

    public int minVector()
    {
        // Retorna el menor elemento del vector
        int i, m;
        m = vec[0]; // Supuesto: el menor elemento está en la primera posición
        for (i = 1; i < n; i++) {
            if (vec[i] < m) {
                m = vec[i];
            }
        }
        return m;
    }

    public int totalOddPositionEven()
    {
        // Cuenta cuántos elementos en posiciones pares (0,2,4,...) son impares
        int i, c;
        c = 0;
        for (i = 0; i < n; i += 2) {
            if (vec[i] % 2 == 1) {
                c++;
            }
        }
        return c;
    }

    public double variance()
    {
        // Calcula la varianza muestral (dividiendo entre n-1)
        double s = 0;
        double mean = avgVector();
        for (int i = 0; i < n; i++) {
            s = s + Math.pow(vec[i] - mean, 2);
        }
        return s / (n - 1);
    }

    public double desviation()
    {
        // Desviación estándar como raíz cuadrada de la varianza
        return Math.sqrt(variance());
    }

    public void interchange()
    {
        // Intercambia elementos de los extremos hacia el centro
        int aux;
        for (int i = 0; i < n / 2; i++) {
            aux = vec[i];
            vec[i] = vec[n - i - 1];
            vec[n - i - 1] = aux;
        }
    }
       
}
