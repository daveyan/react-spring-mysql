package com.example.reactspringmysql.enums;

public enum SensorSize {
    MEDUIM_FORMAT("Medium"),
    FULL_FRAME("Full Frame"),
    APSC("APSC"),
    M43("Micro Four Thirds"),
    ONE_INCH("One Inch Type");

    final String size;

    SensorSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
