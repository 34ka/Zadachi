package zadachi.shape;

import java.util.ArrayList;
import java.util.List;

public class Box extends Shape {
    private double capacity;
    private double volume;
    private List<Shape> figures = new ArrayList<>();//Указал, что элементами ArrayList могут быть только элементы типа данных Shape и вмещаемость 15 элементов


    @Override
    public double getVolume() {
        return volume;
    }



    @Override
    public String toString() {
        String result = "";
        for (Shape d : figures) {
            result += d.toString();
        }
        return " This is box with objects = " + result;
    }

    public Box(double capacity) {
        this.capacity = capacity;
        this.volume = capacity;
    }

    public boolean add(Shape figure) {// т.к. любой класс это тип данных то, создаём в параметрах ссылочную переменную figure типа данных Shape
        if (capacity >= figure.getVolume()) {
            figures.add(figure);// добавляем через .add в Arraylist figures нашу фигуру из класса Shape
            capacity = capacity - figure.getVolume();//после добавления фигуры из общей вместимости вычитаем объём фигуры
            return true;
        } else {
            return false;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public List<Shape> getFigures() {
        return figures;
    }

    //Нужно  сделать, чтобы он удалял все фигуры и тут же капасити обновляю до изначального значения.
    // public List<Shape> getFigures() {
    //        return figures.clear;
    //    }


}