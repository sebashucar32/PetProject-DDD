package co.com.sofka.ddd.cliente.command;

import co.com.sofka.ddd.cliente.value.Indicativo;
import co.com.sofka.ddd.cliente.value.Numero;
import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.ddd.cliente.value.TelefonoId;
import co.com.sofka.domain.generic.Command;

public class AgregarTelefono extends Command {
    private final PersonaId personaId;
    private final TelefonoId telefonoId;
    private final Indicativo indicativo;
    private final Numero numero;

    public AgregarTelefono(PersonaId personaId, TelefonoId telefonoId, Indicativo indicativo, Numero numero) {
        this.personaId = personaId;
        this.telefonoId = telefonoId;
        this.indicativo = indicativo;
        this.numero = numero;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public TelefonoId getTelefonoId() {
        return telefonoId;
    }

    public Indicativo getIndicativo() {
        return indicativo;
    }

    public Numero getNumero() {
        return numero;
    }
}
