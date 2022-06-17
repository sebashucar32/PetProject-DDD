package co.com.sofka.ddd.cliente.value;

import co.com.sofka.domain.generic.Identity;

public class TelefonoId extends Identity {

    private TelefonoId(String uuid) {
        super(uuid);
    }

    public TelefonoId() {
    }

    public static TelefonoId of(String id){
        return new TelefonoId(id);
    }
}
