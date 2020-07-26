package ru.geekbrains.part2.lesson1;

public class Human implements Actions {
    private String name;
    private EntityType entityType;
    private int jumpRestrictions;
    private int runRestrictions;

    public Human(String name, int jumpRestrictions, int runRestrictions) {
        this.name = name;
        this.entityType = EntityType.HUMAN;
        this.jumpRestrictions = jumpRestrictions;
        this.runRestrictions = runRestrictions;
    }

    @Override
    public boolean overcome(Barrier barrier) {
        boolean result;
        result = false;
        if (barrier instanceof Wall)
        {
            if (jumpRestrictions > barrier.getValue())
            {
                System.out.printf("Human %s jumped over %s \n",name,barrier.getValue());
                result = true;
            }
            else{
                System.out.printf("Human %s NOT jumped over %s \n",name,barrier.getValue());
                result = false;
            }
        }
        if (barrier instanceof Treadmill)
        {
            if (runRestrictions > barrier.getValue())
            {
                System.out.printf("Human %s ran over %s \n",name,barrier.getValue());
                result = true;
            }
            else{
                System.out.printf("Human %s NOT ran over %s \n",name,barrier.getValue());
                result = false;
            }
        }
        return result;
    }
}
