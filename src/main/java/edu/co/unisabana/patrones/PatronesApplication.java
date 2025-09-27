package edu.co.unisabana.patrones;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.co.unisabana.patrones.bridge.Notificacion;
import edu.co.unisabana.patrones.bridge.NotificacionAlerta;
import edu.co.unisabana.patrones.bridge.NotificacionConfirmacion;
import edu.co.unisabana.patrones.bridge.NotificacionMensaje;
import edu.co.unisabana.patrones.bridge.Plataforma;
import edu.co.unisabana.patrones.bridge.PlataformaEscritorio;
import edu.co.unisabana.patrones.bridge.PlataformaMovil;
import edu.co.unisabana.patrones.bridge.PlataformaWeb;
import edu.co.unisabana.patrones.builder.Automovil;
import edu.co.unisabana.patrones.builder.AutomovilDeportivo;
import edu.co.unisabana.patrones.builder.AutomovilSUV;
import edu.co.unisabana.patrones.builder.Director;

@SpringBootApplication
public class PatronesApplication {
    public class BuilderDemo {
        public static void main(String[] args) {
            Director director = new Director(new AutomovilSUV());
            Automovil suv = director.construirSUV(new AutomovilSUV());
            System.out.println(suv);

            Automovil deportivo = director.construirDeportivo(new AutomovilDeportivo());
            System.out.println(deportivo);
        }
    }

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

}
