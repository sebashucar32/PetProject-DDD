package co.com.sofka.ddd.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {
    private final Integer value;

    public Cantidad(Integer value) {
        Objects.requireNonNull(value);
        if (value<=0){
            throw new IllegalArgumentException("El valor no puede menor o igual a 0");
        }
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cantidad cantidad = (Cantidad) o;
        return Objects.equals(value, cantidad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
