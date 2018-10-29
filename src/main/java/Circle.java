public class Circle {
    public double getArea (Double x){
        if(x < 0) {
            throw new ArithmeticException("Только положительные цифры");
        }
        double area = Math.PI*(x*x);
        System.out.println("Area of Circle is: "+ area);
        return area;
    }

    public double getPerimeter (Double x)
    {
        if(x < 0) {
            throw new ArithmeticException("Только положительные цифры");
        }
        double perimeter = 2*Math.PI*x;
        System.out.println("Perimeter of Circle is: "+perimeter);
        return perimeter;
    }
}

