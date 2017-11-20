package lt.Sinomoro.Uzdavinys8;

public class Trikampis extends Figura {
    @Override
    public double calcPerimeter(double surface) {
        double side = Math.sqrt(4*surface/Math.sqrt(3));

        return side*3;
    }

    @Override
    public double calcSurface(double perimeter) {
        double side = perimeter/3;

        return side*side*Math.sqrt(3)/4;
    }
}
