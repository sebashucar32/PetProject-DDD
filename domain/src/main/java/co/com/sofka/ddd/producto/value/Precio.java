package co.com.sofka.ddd.producto.value;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Integer> {
    private final Integer value;

    public Precio(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
