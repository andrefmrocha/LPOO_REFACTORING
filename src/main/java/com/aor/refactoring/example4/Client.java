package com.aor.refactoring.example4;

public class Client implements Associate {
    private final String name;
    private final String phone;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }
}
