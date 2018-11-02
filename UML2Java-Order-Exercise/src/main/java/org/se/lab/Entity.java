package org.se.lab;

import java.util.Objects;

public abstract class Entity {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id < 0)
            throw new IllegalArgumentException();
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
