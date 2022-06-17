package co.com.sofka.ddd.cliente.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Numero implements ValueObject<Integer> {
    private final Integer value;

    public Numero(Integer value) {
        Objects.requireNonNull(value);
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
        Numero numero = (Numero) o;
        return Objects.equals(value, numero.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
