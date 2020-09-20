package ru.geekbrains.oop2;
//тут у нас все животные
import java.util.Random;

public class animal {
    String name;
    private int runDistance;
    private int swimDistance;
    private double jumpDistance;
    Random random = new Random();
    private int r=random.nextInt(50); // вот наш разброс, можем сделать любое число и к любому полю

    animal(String n,int a, int b, double c)
    {
        this.name =n;
        this.runDistance = a*r; //добавили разброс к бегу допустим, хотя не принципиально можно и во все парметры
        this.swimDistance = b;
        this.jumpDistance = c;
    }

     String run(int distance)
    {
        if(distance <= this.runDistance)
        {

            return this.name +" пробежал дистанцию!";
        }
        else return this.name +" не добежал " + (distance-this.runDistance) + " метров";

    }
     String swim(int distance)
    {
     //   if(this.name=="котик")
       // {
        //    return " Котики не плавают"; // просто альтернативное решение от переопределения, но это я так на всякий случай.. сделал и переопределение
       // }
         if(distance <= this.swimDistance)
        {

            return this.name +" проплыл дистанцию!";
        }
        else return this.name +" не доплыл " + (distance-this.swimDistance) + " метров";
    }
     String jump(double distance)
    {
        if(distance <= this.jumpDistance)
        {

            return this.name +" перпыгнул препятствие!";
        }
        else return this.name +" не смог допрыгнуть " + (distance - this.runDistance) + " метров";
    }
}
