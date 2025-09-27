package edu.co.unisabana.patrones.builder;

public interface BuilderAutomovil {
    void buildMotor();
    void buildColor();
    void buildRines();
    void buildInteriores();
    void buildExtras();
    Automovil getAutomovil();
}
