class Rectangle {
    public double getArea (Double firstSide, Double secondSide)    {
    if(firstSide < 0) {
        throw new ArithmeticException("Только положительные цифры");
    } else if (secondSide < 0) {
        throw new ArithmeticException("Только положительные цифры");
    }
        double area = firstSide*secondSide;
        System.out.println("Area of Rectangle is: "+area);
        return area;
    }

    public double getPerimeter (Double firstSide, Double secondSide)
    {
        if(firstSide < 0) {
            throw new ArithmeticException("Только положительные цифры");
        } else if (secondSide < 0) {
            throw new ArithmeticException("Только положительные цифры");
        }
        double perimeter = 2*(firstSide+secondSide);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
        return perimeter;
    }
}