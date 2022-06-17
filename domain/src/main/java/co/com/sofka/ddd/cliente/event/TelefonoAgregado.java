package co.com.sofka.ddd.cliente.event;

import co.com.sofka.ddd.cliente.value.Indicativo;
import co.com.sofka.ddd.cliente.value.Numero;
import co.com.sofka.ddd.cliente.value.TelefonoId;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoAgregado extends DomainEvent {
    private final TelefonoId telefonoId;
    private final Indicativo indicativo;
    private final Numero numero;

    public TelefonoAgregado(TelefonoId telefonoId, Indicativo indicativo, Numero numero) {
        super("sofka.persona.TelefonoAgregado");
        this.telefonoId = telefonoId;
        this.indicativo = indicativo;
        this.numero = numero;
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
