package co.com.sofka.ddd.orden.value;

import co.com.sofka.domain.generic.Identity;

public class ItemId extends Identity {
    private ItemId(String uuid) {
        super(uuid);
    }

    public ItemId() {
    }

    public static ItemId of(String id){
        return new ItemId(id);
    }
}
