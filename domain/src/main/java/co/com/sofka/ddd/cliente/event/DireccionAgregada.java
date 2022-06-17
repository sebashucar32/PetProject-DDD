package co.com.sofka.ddd.cliente.event;

import co.com.sofka.ddd.cliente.value.DireccionId;
import co.com.sofka.ddd.cliente.value.Domicilio;
import co.com.sofka.ddd.cliente.value.Pais;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionAgregada extends DomainEvent {
    private final DireccionId direccionId;
    private final Pais pais;
    private final Domicilio domicilio;

    public DireccionAgregada(DireccionId direccionId, Pais pais, Domicilio domicilio) {
        super("sofka.persona.DireccionAgregada");
        this.direccionId = direccionId;
        this.pais = pais;
        this.domicilio = domicilio;
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
