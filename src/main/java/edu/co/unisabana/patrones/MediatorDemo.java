package edu.co.unisabana.patrones;

import edu.co.unisabana.patrones.mediator.SalaDeChat;
import edu.co.unisabana.patrones.mediator.Usuario;

public class MediatorDemo {
    public static void main(String[] args) {
        SalaDeChat sala = new SalaDeChat();
        Usuario ana = new Usuario("Ana", sala);
        Usuario juan = new Usuario("Juan", sala);
        Usuario luisa = new Usuario("Luisa", sala);

        ana.enviar("¡Hola!");
        juan.enviar("¡Bienvenida, Ana!");
        luisa.enviar("¡Hola a todos!");
    }
}
