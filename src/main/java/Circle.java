public class Circle {
    public double getArea (Double x){

        double area = Math.PI*(x*x);
        System.out.println("Area of Circle is: "+ area);
        return area;
    }

    public double getPerimeter (Double x)
    {
        double perimeter = 2*Math.PI*x;
        System.out.println("Perimeter of Circle is: "+perimeter);
        return perimeter;
    }
}

