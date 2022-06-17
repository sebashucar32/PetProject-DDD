package co.com.sofka.ddd.cliente.command;

import co.com.sofka.ddd.cliente.value.Email;
import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.domain.generic.Command;

public class CambiarEmail extends Command {
    private final PersonaId personaId;
    private final Email email;

    public CambiarEmail(PersonaId personaId, Email email) {
        this.personaId = personaId;
        this.email = email;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Email getEmail() {
        return email;
    }
}
