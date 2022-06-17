package co.com.sofka.ddd.producto.value;

import co.com.sofka.domain.generic.Identity;

public class ProveedorId extends Identity {
    private ProveedorId(String uuid) {
        super(uuid);
    }

    public ProveedorId() {
    }

    public static ProveedorId of(String id){
        return new ProveedorId(id);
    }
}
