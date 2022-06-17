package co.com.sofka.ddd.cliente.event;

import co.com.sofka.ddd.cliente.value.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailCambiado extends DomainEvent {

    private final Email email;

    public EmailCambiado(Email email) {
        super("sofka.persona.EmailCambiado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
