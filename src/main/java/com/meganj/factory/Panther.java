package com.meganj.factory;

import com.meganj.domain.Feline;

public class Panther extends Feline {

    private String s;
    private int i;
    private Panther panther;

    public Panther() {
    }

    public Panther(String s, int i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return "panther";
    }
}
