package com.company;

class Circle extends Figure {
    private double radius;
    private double Pi = 3.14;

    Circle (double radius) {
        this.radius = radius;
    }

    void findPerimeter() {
        P = 2 * Pi * radius;
        System.out.println("Периметр круга = " + P + " см");
    }

    void findSquare() {
        S = Pi * radius * radius;
        System.out.println("Площадь круга = " + S + " кв. см.");
    }
}
