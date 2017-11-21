package lt.Sinomoro.Uzdavinys8;

public class Main {

    public static void main(String[] args)
    {
        Figura kvadratas = new Kvadratas();
        Figura trikampis = new Trikampis();
        Figura apskritimas = new Apskritimas();
        System.out.println("Perimetrai su plotu lygiu 100 :");
        System.out.println("Kvadratas : " + kvadratas.calcPerimeter(100));
        System.out.println("Apskritimas : " + apskritimas.calcPerimeter(100));
        System.out.println("Trikampis : " + trikampis.calcPerimeter(100));
        System.out.println("Plotai su perimetru lygiu 100 :");
        System.out.println("Kvadratas : " + kvadratas.calcSurface(100));
        System.out.println("Apskritimas : " + apskritimas.calcSurface(100));
        System.out.println("Trikampis : " + trikampis.calcSurface(100));
    }
}
