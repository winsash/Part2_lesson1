package ru.geekbrains.part2.lesson1;

public class Treadmill extends Barrier{

    protected Treadmill(int value) {
        super(value);
        super.barrierType = BarrierType.TREADMILL;
    }
}
