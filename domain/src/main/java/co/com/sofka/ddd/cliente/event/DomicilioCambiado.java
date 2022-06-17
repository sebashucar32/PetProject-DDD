package co.com.sofka.ddd.cliente.event;

import co.com.sofka.ddd.cliente.value.DireccionId;
import co.com.sofka.ddd.cliente.value.Domicilio;
import co.com.sofka.domain.generic.DomainEvent;

public class DomicilioCambiado extends DomainEvent {
    private final DireccionId direccionId;
    private final Domicilio domicilio;

    public DomicilioCambiado(DireccionId direccionId, Domicilio domicilio) {
        super("sofka.persona.Objects.requireNonNull();");
        this.direccionId = direccionId;
        this.domicilio = domicilio;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
}
