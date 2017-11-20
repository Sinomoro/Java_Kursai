package lt.Sinomoro.Uzdavinys8;

public class Apskritimas extends Figura {
    @Override
    public double calcPerimeter(double surface) {
        double radius = Math.sqrt(surface/Math.PI);
        return 2*radius*Math.PI;
    }

    @Override
    public double calcSurface(double perimeter) {
        double radius = perimeter/(2*Math.PI);
        return Math.PI * radius*radius;
    }
}
