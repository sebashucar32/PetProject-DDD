package co.com.sofka.ddd.cliente.command;

import co.com.sofka.ddd.cliente.value.DireccionId;
import co.com.sofka.ddd.cliente.value.Domicilio;
import co.com.sofka.ddd.cliente.value.Pais;
import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.domain.generic.Command;

public class AgregarDireccion extends Command {
    private final PersonaId personaId;
    private final DireccionId direccionId;
    private final Pais pais;
    private final Domicilio domicilio;

    public AgregarDireccion(PersonaId personaId, DireccionId direccionId, Pais pais, Domicilio domicilio) {
        this.personaId = personaId;
        this.direccionId = direccionId;
        this.pais = pais;
        this.domicilio = domicilio;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public Pais getPais() {
        return pais;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
}
