package com.example.reactspringmysql.enums;

public enum CameraBrand {

    SONY("Sony");

    final String name;

    CameraBrand(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
