package edu.co.unisabana.patrones;

import edu.co.unisabana.patrones.builder.Automovil;
import edu.co.unisabana.patrones.builder.AutomovilDeportivo;
import edu.co.unisabana.patrones.builder.AutomovilSUV;
import edu.co.unisabana.patrones.builder.Director;

public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director(new AutomovilSUV());
        Automovil suv = director.construirSUV(new AutomovilSUV());
        System.out.println(suv);

        Automovil deportivo = director.construirDeportivo(new AutomovilDeportivo());
        System.out.println(deportivo);
    }
}
