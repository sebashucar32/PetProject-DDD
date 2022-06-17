package co.com.sofka.ddd.orden;

import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.ddd.orden.event.CantidadItemActualizada;
import co.com.sofka.ddd.orden.event.EnvioCreado;
import co.com.sofka.ddd.orden.event.FormaPagoActualizada;
import co.com.sofka.ddd.orden.event.ItemAgregado;
import co.com.sofka.ddd.orden.value.*;
import co.com.sofka.ddd.producto.value.ProductoId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Envio extends AggregateEvent<EnvioId> {
    protected Set<Item> items;
    protected Pago pago;
    protected FechaEnvio fechaEnvio;
    protected Total total;
    protected PersonaId personaId;

    public Envio(EnvioId entityId, Set<Item> items, Pago pago, FechaEnvio fechaEnvio, Total total, PersonaId personaId) {
        super(entityId);
        subscribe(new EnvioChange(this));
        appendChange(new EnvioCreado(personaId, pago)).apply();
    }

    private Envio(EnvioId entityId) {
        super(entityId);
        subscribe(new EnvioChange(this));
    }

    public static Envio from(EnvioId envioId, List<DomainEvent> events){
        var envio = new Envio(envioId);
        events.forEach(envio::applyEvent);
        return envio;
    }

    public void agregarItem(ItemId entityId, Cantidad cantidad, Valor valor, ProductoId productoId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cantidad);
        Objects.requireNonNull(valor);
        Objects.requireNonNull(productoId);
        appendChange(new ItemAgregado(entityId,cantidad,valor,productoId));
    }

    public void actualizaCantidadItem(ItemId itemId, Cantidad cantidad){
        Objects.requireNonNull(itemId);
        Objects.requireNonNull(cantidad);
        appendChange(new CantidadItemActualizada(itemId,cantidad)).apply();
    }

    public void actualizarFormaPago(TipoPago tipoPago){
        Objects.requireNonNull(tipoPago);
        appendChange(new FormaPagoActualizada(tipoPago));

    }

    public Optional<Item> getItemPorId(ItemId itemId){
        return items
                .stream()
                .filter(item -> item.identity().equals(itemId))
                .findFirst();
    }

    public Set<Item> items() {
        return items;
    }

    public Pago pago() {
        return pago;
    }

    public FechaEnvio fechaEnvio() {
        return fechaEnvio;
    }

    public Total total() {
        return total;
    }

    public PersonaId personaId() {
        return personaId;
    }
}
