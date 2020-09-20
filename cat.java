package ru.geekbrains.oop2;

public class cat extends animal {
    static String  name="котик";
    static int runDistance = 200;
    static int swimDistance = 0;
    static int jumpDistance = 2;


    cat()
    {
        super(name, runDistance, swimDistance,jumpDistance);

    }

    @Override
    String swim(int distance) {
        return "Котейки не плавают";
    }
}
