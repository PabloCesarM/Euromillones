package com.example.euromillones;

public class Boleto {
    private int[] numeros;
    private int[] estrellas;

    // Constructor por defecto
    public Boleto() {
        this.numeros = new int[5];
        this.estrellas = new int[2];
    }

    // Constructor con parámetros
    public Boleto(int[] numeros, int[] estrellas) {
        this.numeros = numeros;
        this.estrellas = estrellas;
    }

    // Métodos getter y setter
    public int[] getNumeros() { return numeros;    }

    public void setNumeros(int[] numeros) {
        if (numeros.length != 5) {
            throw new IllegalArgumentException("El array de números debe contener exactamente 5 elementos.");
        }
        this.numeros = numeros;
    }

    public int[] getEstrellas() {  return estrellas;    }

    public void setEstrellas(int[] estrellas) {
        if (estrellas.length != 2) {
            throw new IllegalArgumentException("El array de estrellas debe contener exactamente 2 elementos.");
        }
        this.estrellas = estrellas;
    }

    // Método para mostrar el contenido del boleto
    public String mostrarBoleto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Números: ");
        for (int numero : numeros) {
            sb.append(numero).append(" ");
        }
        sb.append("\nEstrellas: ");
        for (int estrella : estrellas) {
            sb.append(estrella).append(" ");
        }
        return sb.toString();
    }


}
