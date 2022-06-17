package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.event.*;
import co.com.sofka.ddd.cliente.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Persona extends AggregateEvent<PersonaId> {

    protected List<Direccion> direcciones;
    protected List<Telefono> telefonos;
    protected Nombre nombre;
    protected Email email;

    public Persona(PersonaId entityId, Nombre nombre, Email email) {
        super(entityId);
        subscribe(new PersonaChange(this));
        appendChange(new PersonaCreada(nombre,email)).apply();
    }

    private Persona(PersonaId entityId) {
        super(entityId);
        subscribe(new PersonaChange(this));
    }

    public static Persona from(PersonaId personaId, List<DomainEvent> events){
        var persona = new Persona(personaId);
        events.forEach(persona::applyEvent);
        return persona;
    }

    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void cambiarEmail(Email email){
        appendChange(new EmailCambiado(email)).apply();
    }

    public void agregarTelefono(TelefonoId telefonoId, Indicativo indicativo, Numero numero){
        Objects.requireNonNull(telefonoId);
        Objects.requireNonNull(indicativo);
        Objects.requireNonNull(numero);
        appendChange(new TelefonoAgregado(telefonoId,indicativo,numero)).apply();
    }

    public void agregarDireccion(DireccionId direccionId, Pais pais, Domicilio domicilio){
        Objects.requireNonNull(direccionId);
        Objects.requireNonNull(pais);
        Objects.requireNonNull(domicilio);
        appendChange(new DireccionAgregada(direccionId,pais,domicilio)).apply();
    }

    public void cambiarDomicilio(DireccionId direccionId, Domicilio domicilio){
        Objects.requireNonNull(direccionId);
        Objects.requireNonNull(domicilio);
        appendChange(new DomicilioCambiado(direccionId,domicilio)).apply();
    }

    public void cambiarNumeroTelefono(TelefonoId telefonoId, Numero numero){
        Objects.requireNonNull(telefonoId);
        Objects.requireNonNull(numero);
        appendChange(new NumeroTelefonoCambiado(telefonoId,numero)).apply();
    }

    public Optional<Direccion> getDireccionPorId(DireccionId direccionId){
        return direcciones()
                .stream()
                .filter(direccion -> direccion.identity().equals(direccionId))
                .findFirst();
    }

    public Optional<Telefono> getTelefonoPorId(TelefonoId telefonoId){
        return telefonos()
                .stream()
                .filter(telefono -> telefono.identity().equals(telefonoId))
                .findFirst();
    }

    public List<Direccion> direcciones() {
        return direcciones;
    }

    public List<Telefono> telefonos() {
        return telefonos;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Email email() {
        return email;
    }
}
