package ru.geekbrains.oop2;
//здесь собачки
public class dog extends animal {
    static String name="пёсик";
    static int runDistance = 500;
    static int swimDistance = 10;
    static double jumpDistance = 0.5;


    dog()
    {
        super(name, runDistance, swimDistance,jumpDistance);

    }
    @Override
    String run(int distance)
    {
        if(distance <= this.runDistance)
        {

            return this.name +" пробежал дистанцию!";
        }
        else return this.name +" не добежал " + (distance-this.runDistance) + " метров";

    }


}
