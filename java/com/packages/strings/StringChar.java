 package com.packages.strings;

public class StringChar 
{
    // campo que guarda el texto actualmente gestionado por el objeto
    String text;

    public StringChar()
    {
        // constructor sin parámetros: inicializa el texto como cadena vacía
        text = "";
    }

    public StringChar(String text)
    {
        // constructor que recibe un texto inicial
        this.text = text;
    }

    public String getText() 
    {
        // devuelve el contenido del campo text
        return text;
    }

    public void setText(String text) 
    {
        // actualiza el campo text con el valor proporcionado
        this.text = text;
    }

    public int lengthString()
    {
        // retorna la longitud del texto actual (número de caracteres)
        return this.text.length();
    }

    public String upperString()
    {
        // transforma el texto a mayúsculas y lo devuelve
        return this.text.toUpperCase();
    }
    
    public String lowerString()
    {
        // transforma el texto a minúsculas y lo devuelve
        return this.text.toLowerCase();
    }
    
    public void palindrome()
    {
        // método público que analiza si el texto actual es un palíndromo
        // copia el texto para no modificar el original
        String phrase = this.text;
        // pasa todo a minúsculas para ignorar distinciones de mayúsculas
        phrase = phrase.toLowerCase();
        // elimina espacios internos y en los extremos
        phrase = this.deleteSpaces(phrase);
        // muestra la frase procesada (sin espacios y en minúsculas)
        System.out.println(phrase);
        // compara caracteres desde los extremos hacia el centro
        if (this.compareCharacters(phrase)) {
            System.out.println(this.text + " es palíndromo");
        } else {
            System.out.println(this.text + " no es palíndromo");
        }
    }

    private String deleteSpaces(String phrase)
    {
        // elimina todos los espacios dentro de la cadena
        // comienza eliminando espacios al inicio y final
        phrase = phrase.trim();
        int i = 0;
        // recorre la cadena carácter por carácter
        while (i < phrase.length()) {
            // si encuentra un espacio, lo corta de la cadena
            if (phrase.substring(i, i + 1).equals(" ")) {
                phrase = phrase.substring(0, i) + 
                    phrase.substring(i + 1, phrase.length());
            } else {
                // solo avanza el índice cuando no hubo eliminación
                i++; // equivalente a i = i + 1
            }
        }
        return phrase;
    }

    private boolean compareCharacters(String phrase)
    {
        // compara pares de caracteres desde los extremos hacia el centro
        boolean sw = true; // bandera que indica si sigue siendo palíndromo
        int i = 0;
        // solo es necesario verificar hasta la mitad de la frase
        while (i <= phrase.length() / 2 && sw) {
            // extrae el carácter en la posición i y el opuesto al final
            if (phrase.substring(i, i + 1).equals(phrase.substring(phrase.length() - i - 1, phrase.length() - i ))) {
                i++; // continúa con el siguiente par
            } else {
                sw = false; // encontró una desiguldad
            }
        }
        return sw;
    }
    
    /**
     * Cuenta cuántas veces aparece un carácter específico en el texto actual.
     * @param ch carácter a buscar
     * @return cantidad de apariciones en el texto (0 si el texto es nulo o vacío)
     */
    public int countChar(char ch)
    {
        if (this.text == null || this.text.isEmpty()) {
            return 0;
        }
        int count = 0;
        // recorre todo el texto contando coincidencias con el carácter dado
        for (int i = 0; i < this.text.length(); i++) {
            if (this.text.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    
}