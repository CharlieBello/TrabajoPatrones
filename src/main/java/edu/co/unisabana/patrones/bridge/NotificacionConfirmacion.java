package edu.co.unisabana.patrones.bridge;

public class NotificacionConfirmacion extends Notificacion {
    public NotificacionConfirmacion(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("[Confirmación] " + mensaje);
    }
}
