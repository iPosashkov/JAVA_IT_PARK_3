package com.company;
import java.lang.Math;

class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle (double sideA, double sideB, double sideC) {
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Сторона треугольника должна быть меньше суммы двух других" +
                    "\nВведите корректные значения");
        }
    }

    void findPerimeter () {
        P = sideA + sideB + sideC;
        System.out.println("Периметр треугольника = " + P + " см");
        }

    void findSquare () {
        P = sideA + sideB + sideC;
        S = (P/2 * (P/2 - sideA) * (P/2 - sideB) * (P/2 - sideC));// закон Герона
        S = Math.sqrt(S);
        System.out.println("Площадь треугольника = " + S + " кв. см.");
        }
    }
