package co.com.sofka.ddd.orden.event;

import co.com.sofka.ddd.orden.value.TipoPago;
import co.com.sofka.domain.generic.DomainEvent;

public class FormaPagoActualizada extends DomainEvent {
    private final TipoPago tipoPago;

    public FormaPagoActualizada(TipoPago tipoPago) {
        super("sofka.envio.FormaPagoActualizada");
        this.tipoPago = tipoPago;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }
}
