package co.com.sofka.ddd.orden;

import co.com.sofka.ddd.orden.value.PagoId;
import co.com.sofka.ddd.orden.value.TipoPago;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Pago extends Entity<PagoId> {

    private TipoPago tipoPago;

    public Pago(PagoId entityId, TipoPago tipoPago) {
        super(entityId);
        this.tipoPago = tipoPago;
    }

    public void actualizaTipoPago(TipoPago tipoPago){
        Objects.requireNonNull(tipoPago);
        this.tipoPago=tipoPago;
    }

    public TipoPago tipoPago() {
        return tipoPago;
    }
}
