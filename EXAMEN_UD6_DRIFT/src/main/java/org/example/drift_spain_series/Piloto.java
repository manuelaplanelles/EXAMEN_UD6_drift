package org.example.drift_spain_series;

public class Piloto extends Participante {
    private String marca;
    private EstadoCoche estado;
    private int puntuacion;


    public Piloto(String nombre, String pais, String Marca) {
        super();
        this.marca=marca;
        this.estado=EstadoCoche.PENDIENTE;
        this.puntuacion=0;
    }
    public Inscripcion inscripcion(){

    }
    public void pagarInscripcion(Inscripcion inscripcion){

    }
//getSet
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EstadoCoche getEstado() {
        return estado;
    }

    public void setEstado(EstadoCoche estado) {
        this.estado = estado;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
//toString
    @Override
    public String toString() {
        return "Piloto{" +
                "marca='" + marca + '\'' +
                ", estado=" + estado +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
