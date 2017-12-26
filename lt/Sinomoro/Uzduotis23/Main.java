package lt.Sinomoro.Uzduotis23;

import java.util.Random;

public class Main {


    static final int numbersToGenerate = 200;
    static final int range = 100;
    static int[] countHolder = new int[numbersToGenerate];


    public static void main(String... args) throws InterruptedException {
        Main n = new Main();
        n.startNumGenerator(5,range,numbersToGenerate);
        for(int i= 0; i<range;i++)
        {
            System.out.println((i+1) + " (" + countHolder[i]+ ")");
        }
    }

    void startNumGenerator(int generatorCount,int range,int numbersToBeGenerated) throws InterruptedException {
        Thread[] gijos = new Thread[generatorCount];
        for(int nr= 0; nr<generatorCount ; nr++) {
            gijos[nr] = new Thread(() ->
                {
                    for(int i = 0; i<numbersToBeGenerated;i++)
                    {
                        Random rand = new Random();
                        int  n = rand.nextInt(range) + 1;
                        counter(n);
                    }
                }
            );
            gijos[nr].start();
        }

        for(int i= 0; i<generatorCount ; i++) {
            gijos[i].join();
        }
    }

    synchronized void counter(int number)
    {
        countHolder[number-1]++;
    }
}
