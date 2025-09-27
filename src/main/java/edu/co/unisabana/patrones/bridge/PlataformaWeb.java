package edu.co.unisabana.patrones.bridge;

public class PlataformaWeb implements Plataforma {
    @Override
    public void mostrar(String mensaje) {
        System.out.println("[Web] " + mensaje);
    }
}
