package co.com.sofka.ddd.cliente.command;

import co.com.sofka.ddd.cliente.value.Email;
import co.com.sofka.ddd.cliente.value.Nombre;
import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.domain.generic.Command;

public class CrearPersona extends Command {

    private final PersonaId entityId;
    private final Nombre nombre;
    private final Email email;

    public CrearPersona(PersonaId entityId, Nombre nombre, Email email) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.email = email;
    }

    public PersonaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
