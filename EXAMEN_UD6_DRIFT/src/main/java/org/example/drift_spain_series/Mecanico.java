package org.example.drift_spain_series;

public class Mecanico extends Participante{
    private Piloto piloto;

    public Mecanico(String nombre, String pais, Piloto piloto){
        super(nombre,pais);
        this.piloto=piloto;
    }
    public void revisarVegiculo(){

    }

}
