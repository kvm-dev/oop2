package ru.geekbrains.oop2;
//основной класс
public class oop2 {

    public static void main(String[] args)
    {
    cat c1 = new cat();
    dog d1 = new dog();
    dog d2 = new dog();
        System.out.println(c1.jump(1));
        System.out.println(c1.swim(5));

        System.out.println(d1.swim(1));
        System.out.println(d1.run(600));
        System.out.println(d1.jump(2)); // работает как надо, но, когда я передаю в метод интовое значение в ответ получаю не допрыгнул и орицательное значение черт знает как подсчитанное

        //проверка 8
        //  System.out.println(c1.run(1500));
        //  System.out.println(d1.run(1500));
        //  System.out.println(d2.run(1500));

    }
}



