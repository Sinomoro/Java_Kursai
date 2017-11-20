package lt.Sinomoro.Uzdavinys8;

public class Main {

    public static void main(String[] args)
    {
        Figura kvadratas = new Kvadratas();
        Figura trikampis = new Trikampis();
        Figura apskritimas = new Apskritimas();
        System.out.println(kvadratas.calcPerimeter( 35.074028853269766));
        System.out.println(kvadratas.calcSurface(27));
    }
}
