package co.com.sofka.ddd.producto;

import co.com.sofka.ddd.producto.event.ProductoCreado;
import co.com.sofka.ddd.producto.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Producto extends AggregateEvent<ProductoId> {
    protected CategoriaId categoriaId;
    protected ProveedorId proveedorId;
    protected Nombre nombre;
    protected Precio precio;

    public Producto(ProductoId entityId, CategoriaId categoriaId, ProveedorId proveedorId, Nombre nombre, Precio precio) {
        super(entityId);
        subscribe(new ProductoChange(this));
        appendChange(new ProductoCreado(categoriaId, proveedorId, nombre, precio)).apply();
    }
}
