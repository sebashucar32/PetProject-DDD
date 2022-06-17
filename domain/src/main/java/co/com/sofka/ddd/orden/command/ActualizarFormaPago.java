package co.com.sofka.ddd.orden.command;

import co.com.sofka.ddd.orden.value.EnvioId;
import co.com.sofka.ddd.orden.value.TipoPago;
import co.com.sofka.domain.generic.Command;

public class ActualizarFormaPago extends Command {
    private final EnvioId envioId;
    private final TipoPago tipoPago;

    public ActualizarFormaPago(EnvioId envioId, TipoPago tipoPago) {
        this.envioId = envioId;
        this.tipoPago = tipoPago;
    }

    public EnvioId getEnvioId() {
        return envioId;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }
}
