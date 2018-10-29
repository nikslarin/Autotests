

public class Triangle {
    public double getArea (Double x, Double y, Double z)
    { if(x < 0) {
            throw new ArithmeticException("Только положительные цифры");
        } else if (y < 0) {
            throw new ArithmeticException("Только положительные цифры");
        } else if (z < 0) {
            throw new ArithmeticException("Только положительные цифры");
        }
        double s = (x + y + z) / 2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        System.out.println("Area of Triangle is: "+ area);
        return area;
    }

    public double getPerimeter (Double x, Double y, Double z) {
        if(x < 0) {
        throw new ArithmeticException("Только положительные цифры");
    } else if (y < 0) {
        throw new ArithmeticException("Только положительные цифры");
    } else if (z < 0) {
        throw new ArithmeticException("Только положительные цифры");
    }
        double perimeter = x + y + z;
        System.out.println("Perimeter of Triangle is: "+perimeter);
        return perimeter;
    }
}

