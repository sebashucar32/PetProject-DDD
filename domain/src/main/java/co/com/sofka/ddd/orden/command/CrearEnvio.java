package co.com.sofka.ddd.orden.command;

import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.ddd.orden.Pago;
import co.com.sofka.ddd.orden.value.EnvioId;
import co.com.sofka.domain.generic.Command;

public class CrearEnvio extends Command {
    private final EnvioId envioId;
    private final PersonaId personaId;
    private final Pago pago;

    public CrearEnvio(EnvioId envioId, PersonaId personaId, Pago pago) {
        this.envioId = envioId;
        this.personaId = personaId;
        this.pago = pago;
    }

    public EnvioId getEnvioId() {
        return envioId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Pago getPago() {
        return pago;
    }
}
