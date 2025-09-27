package edu.co.unisabana.patrones.bridge;

public abstract class Notificacion {
    protected Plataforma plataforma;

    public Notificacion(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public abstract void enviar(String mensaje);
}

