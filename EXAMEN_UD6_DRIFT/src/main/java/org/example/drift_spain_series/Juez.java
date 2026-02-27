package org.example.drift_spain_series;

public class Juez extends Participante{
    public Juez(String nombre,String pais){
        super();
    }
    public void validarCocheApto(Piloto piloto){
        if(piloto.getEstado() != EstadoCoche.REVISADO){
            throw new CocheNoRevisadoException();
        }
        piloto.setEstado(EstadoCoche.APTO);
    }
}
