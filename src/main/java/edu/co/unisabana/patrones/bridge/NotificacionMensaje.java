package edu.co.unisabana.patrones.bridge;

public class NotificacionMensaje extends Notificacion {
    public NotificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrar("[Mensaje] " + mensaje);
    }
}
