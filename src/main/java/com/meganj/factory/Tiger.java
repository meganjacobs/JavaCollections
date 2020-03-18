package com.meganj.factory;

import com.meganj.domain.Feline;

public class Tiger extends Feline {

    private String s;
    private int i;
    private Tiger tiger;

    public Tiger() {
    }

    public Tiger(String s, int i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public void setLimbs(int i) {
        this.i = i;
    }


    @Override
    public String toString() {
        return "tiger";
    }
}
