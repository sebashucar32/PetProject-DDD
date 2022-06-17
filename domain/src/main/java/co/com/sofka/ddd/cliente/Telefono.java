package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.value.Indicativo;
import co.com.sofka.ddd.cliente.value.Numero;
import co.com.sofka.ddd.cliente.value.TelefonoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Telefono extends Entity<TelefonoId> {

    private Indicativo indicativo;
    private Numero numero;

    public Telefono(TelefonoId entityId, Indicativo indicativo, Numero numero) {
        super(entityId);
        this.indicativo = indicativo;
        this.numero = numero;
    }

    public void actualizarNumero(Numero numero){
        this.numero = Objects.requireNonNull(numero);
    }

    public Indicativo indicativo() {
        return indicativo;
    }

    public Numero numero() {
        return numero;
    }
}
