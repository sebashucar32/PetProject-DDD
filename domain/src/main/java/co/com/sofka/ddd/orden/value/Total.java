package co.com.sofka.ddd.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Total implements ValueObject<Integer> {

    private final Integer value;

    public Total(Integer value) {
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
        Total total = (Total) o;
        return Objects.equals(value, total.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
