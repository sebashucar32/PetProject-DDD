package co.com.sofka.ddd.cliente.event;

import co.com.sofka.ddd.cliente.value.Email;
import co.com.sofka.ddd.cliente.value.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class PersonaCreada extends DomainEvent {

    private final Nombre nombre;
    private final Email email;

    public PersonaCreada(Nombre nombre, Email email) {
        super("sofka.persona.PersonaCreada");
        this.nombre = nombre;
        this.email = email;
    }


    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
