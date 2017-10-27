package ru.itpark;

public class Triangle extends Figure {
    int sideA;
    int sideB;
    int sideC;
    String titleTriangle;
    Triangle (String titleTriangle, int sideA, int sideB, int sideC) {
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            this.titleTriangle = titleTriangle;
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Сторона треугольника должна быть меньше суммы двух других" +
                    "\nВведите корректные значения");
        }
    }

    public String getTitleTriangle() {
        return titleTriangle;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setTitleTriangle(String titleTriangle) {
        this.titleTriangle = titleTriangle;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}
