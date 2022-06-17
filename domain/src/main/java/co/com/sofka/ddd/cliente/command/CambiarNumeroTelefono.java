package co.com.sofka.ddd.cliente.command;

import co.com.sofka.ddd.cliente.value.Numero;
import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.ddd.cliente.value.TelefonoId;
import co.com.sofka.domain.generic.Command;

public class CambiarNumeroTelefono extends Command {
    private final PersonaId personaId;
    private final TelefonoId telefonoId;
    private final Numero numero;

    public CambiarNumeroTelefono(PersonaId personaId, TelefonoId telefonoId, Numero numero) {
        this.personaId = personaId;
        this.telefonoId = telefonoId;
        this.numero = numero;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public TelefonoId getTelefonoId() {
        return telefonoId;
    }

    public Numero getNumero() {
        return numero;
    }
}
