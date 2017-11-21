package lt.Sinomoro.Uzdavinys8;

public abstract class Figura {

    private String figureName ;

    public void setName(String name) {this.figureName = name;}
    public String getName() {return figureName;}

    public abstract double calcPerimeter(double sideLenght);
    public abstract double calcSurface(double sideLenght);
}
