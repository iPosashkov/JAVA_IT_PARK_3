package com.company;

class Foursquare extends Figure {
    private double sideA;

    Foursquare (double sideA) {
        this.sideA = sideA;
    }
    void findPerimeter () {
        P = 4 * sideA;
        System.out.println("Периметр квадрата = " + P + " см");
    }

    void findSquare () {
        S = sideA * sideA;
        System.out.println("Площадь квадрата = " + S + " кв. см.");
    }
}
