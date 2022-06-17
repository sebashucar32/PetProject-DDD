package co.com.sofka.ddd.orden.event;

import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.ddd.orden.Pago;
import co.com.sofka.domain.generic.DomainEvent;

public class EnvioCreado extends DomainEvent {
    private final PersonaId personaId;
    private final Pago pago;

    public EnvioCreado(PersonaId personaId, Pago pago) {
        super("sofka.orden.EnvioCreada");
        this.personaId = personaId;
        this.pago = pago;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Pago getPago() {
        return pago;
    }
}
