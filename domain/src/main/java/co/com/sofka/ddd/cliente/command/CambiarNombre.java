package co.com.sofka.ddd.cliente.command;

import co.com.sofka.ddd.cliente.value.Nombre;
import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.domain.generic.Command;

public class CambiarNombre extends Command {

    private final PersonaId personaId;
    private final Nombre nombre;

    public CambiarNombre(PersonaId personaId, Nombre nombre) {
        this.personaId = personaId;
        this.nombre = nombre;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
