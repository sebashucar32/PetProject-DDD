package co.com.sofka.producto.casodeuso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ddd.producto.command.CrearProductoCommand;
import co.com.sofka.ddd.producto.event.ProductoCreado;
import co.com.sofka.ddd.producto.value.CategoriaId;
import co.com.sofka.ddd.producto.value.Nombre;
import co.com.sofka.ddd.producto.value.Precio;
import co.com.sofka.ddd.producto.value.ProveedorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearProductoCasoDeUsoTest {
    @Test
    void crearPoducto() {
        //arrange
        CategoriaId categoriaId = CategoriaId.of("1");
        ProveedorId proveedorId = ProveedorId.of("1");
        Nombre nombre = new Nombre("Manzana");
        Precio precio = new Precio(1700);
        var command = new CrearProductoCommand(categoriaId, proveedorId, nombre, precio);
        var usecase = new CrearProductoCasoDeUso();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ProductoCreado) events.get(0);
        Assertions.assertEquals("1", event.getCategoriaId().value());
        Assertions.assertEquals("1", event.getProveedorId().value());
        Assertions.assertEquals("Manzana", event.getNombre().value());
        Assertions.assertEquals(1700, event.getPrecio().value());
    }
}
