package co.com.sofka.ddd.orden;

import co.com.sofka.ddd.orden.value.Cantidad;
import co.com.sofka.ddd.orden.value.ItemId;
import co.com.sofka.ddd.orden.value.Valor;
import co.com.sofka.ddd.producto.value.ProductoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Item extends Entity<ItemId> {
    private Cantidad cantidad;
    private Valor valor;
    private ProductoId productoId;

    public Item(ItemId entityId, Cantidad cantidad, Valor valor, ProductoId productoId) {
        super(entityId);
        this.cantidad = cantidad;
        this.valor = valor;
        this.productoId = productoId;
    }

    public void actualizarCantidad(Cantidad cantidad){
        Objects.requireNonNull(cantidad);
        this.cantidad = cantidad;
    }

    public Cantidad cantidad() {
        return cantidad;
    }

    public Valor valor() {
        return valor;
    }

    public ProductoId productoId() {
        return productoId;
    }
}
