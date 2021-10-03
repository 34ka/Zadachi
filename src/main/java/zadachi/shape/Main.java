package zadachi.shape;
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

public class Main  {

    public static void main(String[] args) {
        Shape cyclinder1 = new Cylinder(4.15, 10.15);
        Shape ball1 = new Ball(15.95);
        Shape ball2 = new Ball(100.78);
        Shape pyramid1 = new Pyramid(75.7, 25.78);
        Box box1 = new Box(500000);


        System.out.println("ball1 " + box1.add(ball1) + " " + box1.getCapacity());
        System.out.println("ball2 " + box1.add(ball2) + " " + box1.getCapacity());
        System.out.println("pyramid1 " + box1.add(pyramid1) + " " + box1.getCapacity());
        System.out.println("cyclinder1 " + box1.add(cyclinder1) + " " + box1.getCapacity());
        System.out.println();
        System.out.println(box1.toString());

    }
}



