package co.com.sofka.ddd.orden.event;

import co.com.sofka.ddd.orden.value.Cantidad;
import co.com.sofka.ddd.orden.value.ItemId;
import co.com.sofka.domain.generic.DomainEvent;

public class CantidadItemActualizada extends DomainEvent {
    private final ItemId itemId;
    private final Cantidad cantidad;

    public CantidadItemActualizada(ItemId itemId, Cantidad cantidad) {
        super("sofka.envio.CantidadItemActualizada");
        this.itemId = itemId;
        this.cantidad = cantidad;
    }

    public ItemId getItemId() {
        return itemId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
