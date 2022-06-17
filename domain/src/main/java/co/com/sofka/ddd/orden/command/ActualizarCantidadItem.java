package co.com.sofka.ddd.orden.command;

import co.com.sofka.ddd.orden.value.Cantidad;
import co.com.sofka.ddd.orden.value.EnvioId;
import co.com.sofka.ddd.orden.value.ItemId;
import co.com.sofka.domain.generic.Command;

public class ActualizarCantidadItem extends Command {
    private final EnvioId envioId;
    private final ItemId itemId;
    private final Cantidad cantidad;

    public ActualizarCantidadItem(EnvioId envioId, ItemId itemId, Cantidad cantidad) {
        this.envioId = envioId;
        this.itemId = itemId;
        this.cantidad = cantidad;
    }

    public EnvioId getEnvioId() {
        return envioId;
    }

    public ItemId getItemId() {
        return itemId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
