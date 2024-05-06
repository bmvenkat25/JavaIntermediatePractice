package Day1;

import java.util.*;
public class Triangle{
    int sideA,sideB,sideC;
    public Triangle() {

    }
    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double calculateArea(Triangle T){
        double s = (T.sideA + T.sideB + T.sideC)/2;
        return Math.sqrt(s * (s-T.sideA) * (s-T.sideB) * (s-T.sideB));
    }
    public int calculatePerimeter(Triangle T){
        return T.sideA + T.sideB + T.sideC;
    }

    public static void main(String[] args){
        Triangle T1 = new Triangle(2,6,7);
        System.out.println(T1.calculatePerimeter(T1));
        System.out.println(T1.calculateArea(T1));
    }
}

