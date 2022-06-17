package co.com.sofka.ddd.cliente.command;

import co.com.sofka.ddd.cliente.value.DireccionId;
import co.com.sofka.ddd.cliente.value.Domicilio;
import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.domain.generic.Command;

public class CambiarDomicilio extends Command {
    private final PersonaId personaId;
    private final DireccionId direccionId;
    private final Domicilio domicilio;

    public CambiarDomicilio(PersonaId personaId, DireccionId direccionId, Domicilio domicilio) {
        this.personaId = personaId;
        this.direccionId = direccionId;
        this.domicilio = domicilio;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
}
