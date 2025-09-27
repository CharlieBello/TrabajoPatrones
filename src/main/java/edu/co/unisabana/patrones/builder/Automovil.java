package edu.co.unisabana.patrones.builder;

public class Automovil {
    private String motor;
    private String color;
    private String rines;
    private String interiores;
    private boolean gps;
    private String techoSolar;

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRines(String rines) {
        this.rines = rines;
    }

    public void setInteriores(String interiores) {
        this.interiores = interiores;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public void setTechoSolar(String techoSolar) {
        this.techoSolar = techoSolar;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", rines='" + rines + '\'' +
                ", interiores='" + interiores + '\'' +
                ", gps=" + gps +
                ", techoSolar='" + techoSolar + '\'' +
                '}';
    }
}
