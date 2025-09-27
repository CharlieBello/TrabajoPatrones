package edu.co.unisabana.patrones.bridge;

public class NotificacionAdvertencia extends Notificacion {
    public NotificacionAdvertencia(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("[Advertencia] " + mensaje);
    }
}
