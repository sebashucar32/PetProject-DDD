package co.com.sofka.ddd.cliente.event;

import co.com.sofka.ddd.cliente.value.Numero;
import co.com.sofka.ddd.cliente.value.TelefonoId;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroTelefonoCambiado extends DomainEvent {
    private final TelefonoId telefonoId;
    private final Numero numero;

    public NumeroTelefonoCambiado(TelefonoId telefonoId, Numero numero) {
        super("sofka.persona.NumeroTelefonoCambiado");
        this.telefonoId = telefonoId;
        this.numero = numero;
    }

    public TelefonoId getTelefonoId() {
        return telefonoId;
    }

    public Numero getNumero() {
        return numero;
    }
}
