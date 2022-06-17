package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class PersonaChange extends EventChange {
    protected PersonaChange(Persona persona) {
        apply((PersonaCreada event)->{
            persona.email = event.getEmail();
            persona.nombre = event.getNombre();
            persona .telefonos = new ArrayList<>();
            persona.direcciones = new ArrayList<>();
        });

        apply((NombreCambiado event)->{
            persona.nombre = event.getNombre();
        });

        apply((EmailCambiado event)->{
            persona.email = event.getEmail();
        });

        apply((TelefonoAgregado event)->{
            persona.telefonos.add(new Telefono(event.getTelefonoId(),event.getIndicativo(),event.getNumero()));
        });

        apply((DireccionAgregada event)->{
            persona.direcciones.add(new Direccion(event.getDireccionId(), event.getPais(), event.getDomicilio()));
        });

        apply((DomicilioCambiado event)->{
            var direcion = persona.getDireccionPorId(event.getDireccionId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontré la dirección"));
            direcion.actualizarDomicilio(event.getDomicilio());
        });

        apply((NumeroTelefonoCambiado event)->{
            var telefono = persona.getTelefonoPorId(event.getTelefonoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encontré el telefono"));
            telefono.actualizarNumero(event.getNumero());
        });
    }
}
