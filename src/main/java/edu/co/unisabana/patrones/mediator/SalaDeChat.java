package edu.co.unisabana.patrones.mediator;

import java.util.ArrayList;
import java.util.List;

public class SalaDeChat implements MediadorChat {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (!usuario.equals(emisor)) {
                usuario.recibir(mensaje, emisor.getNombre());
            }
        }
    }
}
