package edu.co.unisabana.patrones.builder;

public class Director {
    private BuilderAutomovil builder;

    public Director(BuilderAutomovil builder) {
        this.builder = builder;
    }

    public Automovil construirSUV(BuilderAutomovil builder) {
        builder.buildMotor();
        builder.buildColor();
        builder.buildRines();
        builder.buildInteriores();
        builder.buildExtras();
        return builder.getAutomovil();
    }

    public Automovil construirDeportivo(BuilderAutomovil builder) {
        builder.buildMotor();
        builder.buildColor();
        builder.buildRines();
        builder.buildInteriores();
        builder.buildExtras();
        return builder.getAutomovil();
    }
}
