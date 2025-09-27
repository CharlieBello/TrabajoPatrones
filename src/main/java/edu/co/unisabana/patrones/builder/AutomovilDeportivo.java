package edu.co.unisabana.patrones.builder;

public class AutomovilDeportivo implements BuilderAutomovil {
    private Automovil auto;

    public AutomovilDeportivo() {
        this.auto = new Automovil();
    }

    @Override
    public void buildMotor() {
        auto.setMotor("Motor deportivo V8");
    }

    @Override
    public void buildColor() {
        auto.setColor("Rojo");
    }

    @Override
    public void buildRines() {
        auto.setRines("Rines deportivos");
    }

    @Override
    public void buildInteriores() {
        auto.setInteriores("Interiores deportivos");
    }

    @Override
    public void buildExtras() {
        auto.setGps(true);
        auto.setTechoSolar("No tiene");
    }

    @Override
    public Automovil getAutomovil() {
        return auto;
    }
}
