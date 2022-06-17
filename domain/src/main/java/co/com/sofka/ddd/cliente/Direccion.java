package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.value.DireccionId;
import co.com.sofka.ddd.cliente.value.Domicilio;
import co.com.sofka.ddd.cliente.value.Pais;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Direccion extends Entity<DireccionId> {

    private Pais pais;
    private Domicilio domicilio;

    public Direccion(DireccionId entityId, Pais pais, Domicilio domicilio) {
        super(entityId);
        this.pais = pais;
        this.domicilio = domicilio;
    }

    public void actualizarDomicilio(Domicilio domicilio){
        this.domicilio = Objects.requireNonNull(domicilio);
    }

    public Pais pais() {
        return pais;
    }

    public Domicilio domicilio() {
        return domicilio;
    }
}
