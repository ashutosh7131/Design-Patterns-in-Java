class State
{
    public static void main(String args[])
    {
        GearState g0 = new NeutralGear();
        GearState g1 = new FirstGear();
        GearState g2 = new SecondGear();
        GearState g3 = new SuperNitroGear();
        Car c = new Car();
        c.start(g0);
        c.accelerate(20);
        c.changeGear(g2);
        c.accelerate(250);
        c.changeGear(g3);
        c.accelerate(501);

    }
}

/* This example has a car that can be started with any gear; you have to provide a gear as an argument; then changegear can be called; when accelerate to some
speed be called, then gear checks the speed limit of which it can afford, then it displays that message */