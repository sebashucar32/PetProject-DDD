package co.com.sofka.ddd.cliente.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Pais implements ValueObject<String> {

    private final String value;

    public Pais(String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(value, pais.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
