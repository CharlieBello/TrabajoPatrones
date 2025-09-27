package edu.co.unisabana.patrones.bridge;

public class PlataformaMovil implements Plataforma {
    @Override
    public void mostrar(String mensaje) {
        System.out.println("[Móvil] " + mensaje);
    }
}

