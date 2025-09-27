package edu.co.unisabana.patrones.mediator;

public interface MediadorChat {
    void agregarUsuario(Usuario usuario);
    void enviarMensaje(String mensaje, Usuario emisor);
}
