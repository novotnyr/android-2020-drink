package com.github.novotnyr.android.drink;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Drink implements Serializable {
    private UUID id = UUID.randomUUID();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return id.equals(drink.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
