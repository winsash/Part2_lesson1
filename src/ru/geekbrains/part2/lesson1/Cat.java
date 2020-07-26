package ru.geekbrains.part2.lesson1;

public class Cat implements Actions {
    private String name;
    private EntityType entityType;
    private int jumpRestrictions;
    private int runRestrictions;

    public Cat(String name, int jumpRestrictions, int runRestrictions) {
        this.name = name;
        this.jumpRestrictions = jumpRestrictions;
        this.runRestrictions = runRestrictions;
        this.entityType = EntityType.CAT;
    }

    @Override
    public boolean overcome(Barrier barrier) {
        boolean result;
        result = false;
        if (barrier instanceof Wall)
        {
            if (jumpRestrictions > barrier.getValue())
            {
                System.out.printf("CAT %s jumped over %s \n",name,barrier.getValue());
                result = true;
            }
            else{
                System.out.printf("CAT %s NOT jumped over %s \n",name,barrier.getValue());
                result = false;
            }
        }
        if (barrier instanceof Treadmill)
        {
            if (runRestrictions > barrier.getValue())
            {
                System.out.printf("CAT %s ran over %s \n",name,barrier.getValue());
                result = true;
            }
            else{
                System.out.printf("CAT %s NOT ran over %s \n",name,barrier.getValue());
                result = false;
            }
        }
        return result;
    }
}
