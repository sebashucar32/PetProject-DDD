package co.com.sofka.ddd.orden.event;

import co.com.sofka.ddd.orden.value.Cantidad;
import co.com.sofka.ddd.orden.value.ItemId;
import co.com.sofka.ddd.orden.value.Valor;
import co.com.sofka.ddd.producto.value.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ItemAgregado extends DomainEvent {
    private final ItemId entityId;
    private final Cantidad cantidad;
    private final Valor valor;
    private final ProductoId productoId;

    public ItemAgregado(ItemId entityId, Cantidad cantidad, Valor valor, ProductoId productoId) {
        super("sofka.envio.ItemAgregado");
        this.entityId = entityId;
        this.cantidad = cantidad;
        this.valor = valor;
        this.productoId = productoId;
    }

    public ItemId getEntityId() {
        return entityId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public Valor getValor() {
        return valor;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
