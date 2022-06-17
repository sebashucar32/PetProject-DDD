package co.com.sofka.ddd.producto;

import co.com.sofka.ddd.producto.event.ProductoCreado;
import co.com.sofka.domain.generic.EventChange;

public class ProductoChange extends EventChange {
    public ProductoChange(Producto producto) {
        apply((ProductoCreado event) -> {
            producto.proveedorId = event.getProveedorId();
            producto.categoriaId = event.getCategoriaId();
            producto.nombre = event.getNombre();
            producto.precio = event.getPrecio();
        });
    }
}
