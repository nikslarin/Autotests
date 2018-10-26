import java.util.Scanner;


class Rectangle {
    public double getArea (Double firstSide, Double secondSide)
    {
        double area = firstSide*secondSide;
        System.out.println("Area of Rectangle is: "+area);
        return area;
    }

    public double getPerimeter (Double firstSide, Double secondSide)
    {
        double perimeter = 2*(firstSide+secondSide);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
        return perimeter;
    }
}