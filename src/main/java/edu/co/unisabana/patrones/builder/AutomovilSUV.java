package edu.co.unisabana.patrones.builder;

public class AutomovilSUV implements BuilderAutomovil {
    private Automovil auto;

    public AutomovilSUV() {
        this.auto = new Automovil();
    }

    @Override
    public void buildMotor() {
        auto.setMotor("Motor SUV");
    }

    @Override
    public void buildColor() {
        auto.setColor("Negro");
    }

    @Override
    public void buildRines() {
        auto.setRines("Rines grandes");
    }

    @Override
    public void buildInteriores() {
        auto.setInteriores("Interiores de lujo");
    }

    @Override
    public void buildExtras() {
        auto.setGps(true);
        auto.setTechoSolar("Panorámico");
    }

    @Override
    public Automovil getAutomovil() {
        return auto;
    }
}
