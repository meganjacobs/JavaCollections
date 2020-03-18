package com.meganj.domain;

public class Feline {
    private String sound;
    private int limbs;

    public Feline() {
    }

    public Feline(String sound, int limbs) {
        this.sound = sound;
        this.limbs = limbs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
}
