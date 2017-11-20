package lt.Sinomoro.Uzdavinys8;

public class Kvadratas extends Figura {
    @Override
    public double calcPerimeter(double surface) {
        return 4*Math.sqrt(surface);
    }

    @Override
    public double calcSurface(double perimeter) {
        return perimeter*perimeter/16;
    }
}
