package co.com.sofka.ddd.orden.value;

import co.com.sofka.domain.generic.Identity;

public class EnvioId extends Identity {
    private EnvioId(String uuid) {
        super(uuid);
    }

    public EnvioId() {
    }

    public static EnvioId of(String id){
        return new EnvioId(id);
    }
}
