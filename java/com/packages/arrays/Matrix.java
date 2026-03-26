package com.packages.arrays;

// Clase para operaciones básicas con matrices estáticas (tamaño máximo TR x TC)
public class Matrix 
{
    // Tamaños máximos permitidos para filas (TR) y columnas (TC)
    private final int TR = 50;
    private final int TC = 50;

    // m y n representan el número actual de filas y columnas usadas
    private int m, n;

    // Matriz principal (inicializada con tamaño máximo) y matriz para almacenar sumas
    private int mat[][] = new int[TR][TC];
    private int matSum[][] = new int[TR][TC];

    // Constructor: inicializa m y n en 0 (matriz vacía hasta establecer dimensiones)
    public Matrix()
    {
        m = 0;
        n = 0;
    }

    // Getters para los tamaños máximos (constantes)
    public int getTR() 
    {
        return TR;
    }

    public int getTC() 
    {
        return TC;
    }

    // Devuelve el número actual de filas
    public int getM() 
    {
        return m;
    }

    // Establece el número de filas a usar (debe ser <= TR)
    public void setM(int m) 
    {
        this.m = m;
    }

    // Devuelve el número actual de columnas
    public int getN() 
    {
        return n;
    }

    // Establece el número de columnas a usar (debe ser <= TC)
    public void setN(int n) 
    {
        this.n = n;
    }

    
    // Devuelve la referencia a la matriz principal
    public int[][] getMat() 
    {
        return mat;
    }

    // Devuelve la referencia a la matriz donde se almacena la suma de matrices
    public int[][] getMatSum() 
    {
        return matSum;
    }  

    // Crea (rellena) la matriz con valores aleatorios entre 0 y 99
    // Usa m y n como dimensiones efectivas; la matriz subyacente tiene capacidad TR x TC
    public void createMatrix()
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int)(Math.random() * 100);
            }
        }
    }

    // Imprime por consola la matriz pasada como parámetro (usa m x n como dimensiones)
    // Si desea imprimir otra matriz, pasarla como argumento, por ejemplo getMat() o getMatSum()
    public void showMatrix(int [][] mat)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    // Suma elemento a elemento dos matrices mat1 y mat2 (ambas deben tener dimensiones m x n)
    // El resultado se guarda en el campo matSum
    public void sumMatrix(int [][] mat1, int [][] mat2)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matSum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }

    // Imprime la diagonal principal de la matriz (asume matriz cuadrada, es decir m == n)
    public void mainDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + "\t");
        }
        System.out.println();
    }

    // Imprime la diagonal secundaria (desde [0][n-1] hasta [n-1][0])
    public void secondaryDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][n - i - 1] + "\t");
        }
        System.out.println();
    }

    // Imprime la "parte superior" de la matriz (elementos por encima o sobre la diagonal principal)
    // Ahora se muestra en formato matricial respetando filas y columnas: se imprimen tabs en posiciones vacías
    public void upTriangle()
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Imprime el elemento si está en o por encima de la diagonal principal (j >= i)
                if (j >= i) {
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Imprime la "parte derecha" triangular de la matriz en formato matricial
    public void rightTriangle()
    { 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // En la mitad derecha se imprimen los elementos cuya columna j es >= n-1-i
                if (j >= (n - 1 - i)) {
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Imprime la "parte izquierda" triangular de la matriz en formato matricial
    public void leftTriangle()
    { 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // En la mitad izquierda se imprimen los elementos cuya columna j es <= i
                if (j <= i) {
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
