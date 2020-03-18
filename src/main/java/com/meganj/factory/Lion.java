package com.meganj.factory;

import com.meganj.domain.Feline;

public class Lion extends Feline {

    private String s;
    private int i;
    private Lion lion;

    public Lion() {
    }

    public Lion(String s, int i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return "lion";
    }
}
