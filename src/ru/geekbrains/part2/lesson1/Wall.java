package ru.geekbrains.part2.lesson1;

public class Wall extends Barrier {

    protected Wall(int value) {
        super(value);
        super.barrierType = BarrierType.WALL;
    }
}
