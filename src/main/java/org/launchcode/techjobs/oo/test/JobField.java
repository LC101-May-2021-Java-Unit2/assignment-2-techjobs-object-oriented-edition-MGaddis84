package org.launchcode.techjobs.oo.test;

import org.launchcode.techjobs.oo.PositionType;

import java.util.Objects;

public abstract class JobField {

    public int id;
    public static int nextId = 1;
    public String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
