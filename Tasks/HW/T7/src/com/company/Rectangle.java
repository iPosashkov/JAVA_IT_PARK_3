package com.company;

class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    Rectangle (double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    void findPerimeter () {
        P = 2 * (sideA + sideB);
        System.out.println("Периметр прямоугольника = " + P + " см");
    }

    void findSquare () {
        S = sideA * sideB;
        System.out.println("Площадь прямоугольника = " + S + " кв. см.");
    }

}
