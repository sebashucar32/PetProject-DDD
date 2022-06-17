package co.com.sofka.ddd.orden.command;

import co.com.sofka.ddd.orden.value.Cantidad;
import co.com.sofka.ddd.orden.value.EnvioId;
import co.com.sofka.ddd.orden.value.ItemId;
import co.com.sofka.ddd.orden.value.Valor;
import co.com.sofka.ddd.producto.value.ProductoId;
import co.com.sofka.domain.generic.Command;

public class AgregarItem extends Command {
    private final EnvioId envioId;
    private final ItemId entityId;
    private final Cantidad cantidad;
    private final Valor valor;
    private final ProductoId productoId;

    public AgregarItem(EnvioId envioId, ItemId entityId, Cantidad cantidad, Valor valor, ProductoId productoId) {
        this.envioId = envioId;
        this.entityId = entityId;
        this.cantidad = cantidad;
        this.valor = valor;
        this.productoId = productoId;
    }

    public EnvioId getEnvioId() {
        return envioId;
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
