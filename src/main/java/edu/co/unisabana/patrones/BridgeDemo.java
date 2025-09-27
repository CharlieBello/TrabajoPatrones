package edu.co.unisabana.patrones;

import edu.co.unisabana.patrones.bridge.Notificacion;
import edu.co.unisabana.patrones.bridge.NotificacionAlerta;
import edu.co.unisabana.patrones.bridge.NotificacionConfirmacion;
import edu.co.unisabana.patrones.bridge.NotificacionMensaje;
import edu.co.unisabana.patrones.bridge.Plataforma;
import edu.co.unisabana.patrones.bridge.PlataformaEscritorio;
import edu.co.unisabana.patrones.bridge.PlataformaMovil;
import edu.co.unisabana.patrones.bridge.PlataformaWeb;

public class BridgeDemo {
    public static void main(String[] args) {
        Plataforma plataformaWeb = new PlataformaWeb();
        Plataforma plataformaMovil = new PlataformaMovil();
        Plataforma plataformaEscritorio = new PlataformaEscritorio();

        Notificacion n1 = new NotificacionMensaje(plataformaWeb);
        n1.enviar("¡Bienvenido al sistema!");

        Notificacion n2 = new NotificacionAlerta(plataformaMovil);
        n2.enviar("¡Alerta de seguridad!");

        Notificacion n3 = new NotificacionConfirmacion(plataformaEscritorio);
        n3.enviar("Se ha confirmado su pago.");
    }
}