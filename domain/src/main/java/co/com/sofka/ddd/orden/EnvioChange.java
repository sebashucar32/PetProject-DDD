package co.com.sofka.ddd.orden;

import co.com.sofka.ddd.orden.event.CantidadItemActualizada;
import co.com.sofka.ddd.orden.event.EnvioCreado;
import co.com.sofka.ddd.orden.event.FormaPagoActualizada;
import co.com.sofka.ddd.orden.event.ItemAgregado;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class EnvioChange extends EventChange {
    public EnvioChange(Envio envio) {
        apply((EnvioCreado event)->{
            envio.personaId=event.getPersonaId();
            envio.pago=event.getPago();
            envio.items= new HashSet<>();
            envio.total = null;
            envio.fechaEnvio = null;
        });

        apply((ItemAgregado event)->{
            envio.items.add(new Item(event.getEntityId(),event.getCantidad(),event.getValor(),event.getProductoId()));
        });

        apply((CantidadItemActualizada event)->{
            var item = envio.getItemPorId(event.getItemId())
                    .orElseThrow(() -> new IllegalArgumentException("No se ecnontró el item"));
            item.actualizarCantidad(event.getCantidad());
        });

        apply((FormaPagoActualizada event)->{
            envio.pago.actualizaTipoPago(event.getTipoPago());
        });
    }
}
