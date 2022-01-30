package com.example.reactspringmysql.enums;

public enum MountNames {
    A_MOUNT("A Mount");

    final String name;

    MountNames(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
