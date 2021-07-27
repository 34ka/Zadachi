package Zadachi.Shape;
/*
у бокса есть объём

box(double):void может поместить максимальное количество пфигур в объёме. Он хрант весь список

При создании у бокса есть метод, который принимает в себя (shape), и она выдаёт boolean Значение и если нельзя положить 10 литровый шар,
то она может вернуть false и не положить

Почитать агрегацию в uml википедии. хранит самый базовый класс это shape и остальные.

После этого, который я запускаю main я создаю box

box содержит shape и её нельзя переполнить.

shape будет абстрактным классом


могут помочь:

Extends
overriding
абстрактный класс может


пока без интерфейсаинверфейсы
 */

import java.util.ArrayList;

abstract class Shape {// экземпляр абстрактного класса создать нельзя
    public abstract double getVolume();// Метод абстрактный. Его удобно override(переопределять) в других классах
}

abstract class SolidOfRevolution extends Shape {//экземпляр абстрактного класса создать нельзя
    protected double radius;//Access modifier Protected. Видимость = видимости Default + Видимость для классов детей этого protected класса. Дети могут быть в этом пакете и в других.

    public SolidOfRevolution(double radius) {//конструктор никогда не имеет return. имя всегда совпадает с именем класса.
        this.radius = radius;
    }

    public double getRadius () {//метод всегда имеет return(кроме void), имя можно указывать любое.
        return radius;
    }
}


class Cyclinder extends SolidOfRevolution {
    private double height;

    public Cyclinder(double radius, double height) {// идея создала сама этот констрктор только без this.height = height
        super(radius);//super ссылается на текущий объект родительского класса, а он SolidOfRevolution
        this.height = height;//this ссылается на текущий объект класса
    }

    @Override
    public double getVolume() {// идея симплементировала сама этот метод. Нужно было формулу объём подставить правильную, а была просто return 0
        return Math.PI * radius * radius * height;
    }
}


class Ball extends SolidOfRevolution {

    public Ball(double radius) {// идея сама подсказала написать этот конструктор
        super(radius);//super ссылается на текущий объект родительского класса, а он SolidOfRevolution
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
    }
}


class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {// идея симплементировала сама этот метод. Нужно было формулу объём подставить правильную, а была просто return 0
        return 1 / 3 * s * h;
    }
}


class Box extends Shape {
    private double capacity;
    private double volume;
    private ArrayList<Shape> figures = new ArrayList<>();//Я указал, что элементами ArrayList могут быть только элементы типа данных Shape.


    @Override
    public double getVolume() {// идея симплементировала сама этот метод. Нужно было формулу объём подставить правильную, а была просто return 0
        return volume;
    }

    public Box(double capacity) {
        this.capacity = capacity;
        this.volume = capacity;
    }

    public boolean add(Shape figure) {// т.к. любой класс это тип данных то, создаём в параметрах ссылочную переменную figure типа данных Shape
        if(capacity >= figure.getVolume()) {
            figures.add(figure);// добавляем через .add в Arraylist figures нашу фигуру из класса Shape
            capacity = capacity - figure.getVolume();//после добавления фигуры из общей вместимости вычитаем объём фигуры
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        Cyclinder cyclinder1 = new Cyclinder(4.15, 10.15);
        Ball ball1 = new Ball(15.95);
        Ball ball2 = new Ball(100.78);
        Pyramid pyramid1 = new Pyramid(26.43, 34.123);
        Box box1 = new Box(500000);

        System.out.println(box1.add(ball1));
        System.out.println(box1.capacity);
        //System.out.println(box1.add(ball2));
        System.out.println(box1.capacity);
        System.out.println(box1.add(pyramid1));
        System.out.println(box1.capacity);
        System.out.println(box1.add(cyclinder1));
        System.out.println(box1.capacity);
    }
}



