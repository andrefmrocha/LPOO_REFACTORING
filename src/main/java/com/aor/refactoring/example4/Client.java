package com.aor.refactoring.example4;

public class Client extends Associate {

    public Client(String name, String phone) {
        super(name, phone);
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }
}
