package ru.geekbrains.part2.lesson1;

public abstract class Barrier {
    protected int value;
    BarrierType barrierType;

    protected Barrier(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
