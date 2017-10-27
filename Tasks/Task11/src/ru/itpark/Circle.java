package ru.itpark;

public class Circle extends Figure{
    int radius;
    Circle (int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
