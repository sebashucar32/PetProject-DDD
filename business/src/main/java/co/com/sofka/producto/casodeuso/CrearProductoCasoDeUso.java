package co.com.sofka.producto.casodeuso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.producto.Producto;
import co.com.sofka.ddd.producto.command.CrearProductoCommand;
import co.com.sofka.ddd.producto.value.ProductoId;

public class CrearProductoCasoDeUso extends UseCase<RequestCommand<CrearProductoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearProductoCommand> input) {
        var command = input.getCommand();
        var producto = new Producto(new ProductoId(), command.getCategoriaId(), command.getProveedorId(), command.getNombre(), command.getPrecio());
        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }
}
