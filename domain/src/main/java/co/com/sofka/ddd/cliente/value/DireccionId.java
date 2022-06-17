package co.com.sofka.ddd.cliente.value;

import co.com.sofka.domain.generic.Identity;

public class DireccionId extends Identity {

    private DireccionId(String uuid) {
        super(uuid);
    }

    public DireccionId() {}

    public static DireccionId of(String id){
        return new DireccionId(id);
    }
}
