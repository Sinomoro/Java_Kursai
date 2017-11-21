package lt.Sinomoro.Uzdavinys8;

public class Main {

    public static void  calculatePerimeter(double area, Figura fig1,Figura fig2, Figura fig3)
    {
        System.out.println("Perimetrai su plotu lygiu " + area + " :");
        System.out.println(fig1.getName() + " : " + fig1.calcPerimeter(area));
        System.out.println(fig2.getName()+" : " + fig2.calcPerimeter(area));
        System.out.println(fig3.getName()+" : " + fig3.calcPerimeter(area));
    }

    public static void  calculateSurface(double perimeter, Figura fig1,Figura fig2, Figura fig3)
    {
        System.out.println("Plotai su perimetru lygiu " + perimeter + " :");
        System.out.println(fig1.getName()+" : " + fig1.calcSurface(perimeter));
        System.out.println(fig2.getName()+" : " + fig2.calcSurface(perimeter));
        System.out.println(fig3.getName()+" : " + fig3.calcSurface(perimeter));
    }


    public static void main(String[] args)
    {
        Figura kvadratas = new Kvadratas();
        Figura trikampis = new Trikampis();
        Figura apskritimas = new Apskritimas();

        Main.calculateSurface(100,kvadratas, trikampis, apskritimas);
        Main.calculatePerimeter(100,kvadratas, trikampis, apskritimas);
    }
}
