package zadachi.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box implements Shape {
    private double capacity;
    private double volume;
    private List<Shape> figures = new ArrayList<>(5);//Указал, что элементами ArrayList могут быть только элементы типа данных Shape и вмещаемость 15 элементов

    public Box(double capacity) {
        this.capacity = capacity;
        this.volume = capacity;
    }

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

    public void clearFigures() {
        figures.clear();
        capacity = volume;
    }

    public List<Shape> getFigures() {
        return figures;
    }

    public void removeFigure(Shape figure) {
        figures.remove(figure);
        capacity = capacity + figure.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.capacity, capacity) == 0 && Double.compare(box.volume, volume) == 0 && Objects.equals(figures, box.figures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, volume, figures);
    }
}