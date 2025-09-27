package edu.co.unisabana.patrones.mediator;

public class Usuario {
    private String nombre;
    private MediadorChat mediador;

    public Usuario(String nombre, MediadorChat mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
        mediador.agregarUsuario(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void enviar(String mensaje) {
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje, String emisor) {
        System.out.println(nombre + " recibió de " + emisor + ": " + mensaje);
    }
}
