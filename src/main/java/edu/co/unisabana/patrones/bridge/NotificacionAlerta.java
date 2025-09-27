package edu.co.unisabana.patrones.bridge;

public class NotificacionAlerta extends Notificacion {
    public NotificacionAlerta(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("[Alerta] " + mensaje);
    }
}
