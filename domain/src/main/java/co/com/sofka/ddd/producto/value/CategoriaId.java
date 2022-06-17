package co.com.sofka.ddd.producto.value;

import co.com.sofka.domain.generic.Identity;

public class CategoriaId extends Identity {
    private CategoriaId(String uuid) {
        super(uuid);
    }

    public CategoriaId() {
    }

    public static CategoriaId of(String id){
        return new CategoriaId(id);
    }
}
