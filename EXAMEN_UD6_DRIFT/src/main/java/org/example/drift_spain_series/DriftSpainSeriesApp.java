package org.example.drift_spain_series;

import java.util.ArrayList;

public class DriftSpainSeriesApp {

    private static ArrayList<Inscripcion> pilotosInscritos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO A LA APP DEL DRIFT SPAIN SERIES DE VALENCIA ===");
        //a) Crea 3 pilotos para Skoda,Mercedes y Toyota
        Piloto p1 = new Piloto( "SKODA");
        Piloto p2 = new Piloto("MERCEDES");
        Piloto p3 = new Piloto("TOYOTA");

        //b) Todos los pilotos se inscriben en la categoria PRO inscibirse y gusrdar sus inscripciones en la lisa de pilotosInscritois
        Inscripcion ins1 = p1.inscripcion();
        ins1.setCategoria(CategoriaDrift.PRO);
        pilotosInscritos.add(ins1);
        Inscripcion ins2 = p2.inscripcion();
        ins2.setCategoria(CategoriaDrift.PRO);
        pilotosInscritos.add(ins2);
        Inscripcion ins3 = p3.inscripcion();
        ins3.setCategoria(CategoriaDrift.PRO);
        pilotosInscritos.add(ins3);

        //c)crea al juez de la carrera
        Juez juez1 = new Juez("Roberto", "España");

        //d) solo 2 pilotos pagan la isncripcion
        p1.pagarInscripcion(ins1);
        p2.pagarInscripcion(ins2);


    }
    public static void verGanador(CategoriaDrift categoria){

    }
}
