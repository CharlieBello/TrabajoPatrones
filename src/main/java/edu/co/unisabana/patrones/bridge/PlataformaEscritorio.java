package edu.co.unisabana.patrones.bridge;

public class PlataformaEscritorio implements Plataforma {
    @Override
    public void mostrar(String mensaje) {
        System.out.println("[Escritorio] " + mensaje);
    }
}
