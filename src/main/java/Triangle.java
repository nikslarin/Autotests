

public class Triangle {
    public double getArea (Double x, Double y, Double z)
    {
        double s = (x + y + z) / 2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        System.out.println("Area of Triangle is: "+ area);
        return area;
    }

    public double getPerimeter (Double x, Double y, Double z)
    {
        double perimeter = x + y + z;
        System.out.println("Perimeter of Triangle is: "+perimeter);
        return perimeter;
    }
}

