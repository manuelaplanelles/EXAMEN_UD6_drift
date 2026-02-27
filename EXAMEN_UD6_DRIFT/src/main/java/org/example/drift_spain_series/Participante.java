package org.example.drift_spain_series;

import java.util.Scanner;

abstract class Participante {
    private String nombre;
    private String pais;

    public  Participante(String nombre, String pais){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        this.nombre = teclado.next();
        System.out.println("Pais: ");
        this.pais=teclado.next();
    }

    Participante() {
    }


    //setGet
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //toString
    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
