package com.aor.refactoring.example4;

import java.util.Objects;

public abstract class Associate {

    protected final String name;
    protected final String phone;

    public Associate(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public abstract boolean login(String username, String password) ;


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) &&
                Objects.equals(phone, worker.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
