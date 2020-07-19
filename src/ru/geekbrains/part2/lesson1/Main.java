package ru.geekbrains.part2.lesson1;

import javax.swing.event.HyperlinkEvent;

public class Main {

    public static void main(String[] args) {
        Barrier [] barrier_array;
        barrier_array = makeBarriers(6);
        System.out.println();
        Actions [] actions = new Actions[3];
        actions[0] = new Human("Henry",12,12);
        actions[1] = new Cat("Barsik",2,3);
        actions[2] = new Robot("ROBOCOP",7,11);
        for (Actions element : actions)
        {
            passTheBarriers (element,barrier_array);
            System.out.println();
        }
    }

    public static Barrier [] makeBarriers (int count)
    {
        Barrier [] barrier_array = new Barrier [count];
        for (int i=0; i<6; i++)
        {
            int barrier_value = (int)(Math.random()*10) +1;
            if (i%2 == 0)
            {
                barrier_array[i] = new Wall(barrier_value);
                System.out.println("Wall " + barrier_value);
            }
            else {
                barrier_array[i] = new Treadmill(barrier_value);
                System.out.println("TM " + barrier_value);
            }
        }
        return barrier_array;
    }

    public static void passTheBarriers (Actions action, Barrier [] barrier_array)
    {
        for (Barrier item : barrier_array)
        {
            if (!action.overcome(item))
            {
                System.out.println("FALL");
                break;
            };
        }
    }
}
