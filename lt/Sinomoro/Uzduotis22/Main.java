package lt.Sinomoro.Uzduotis22;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        boolean exitFlag = false;
        while (!exitFlag)
        {
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("exit"))
            {
                exitFlag = true;
            }
            else {
                try {
                    indexPrinter(input);
                } catch (URISyntaxException | MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void indexPrinter(String address) throws URISyntaxException, MalformedURLException  {
        URI uri = new URI("https",
                "postit.lt",
                "/data",
                "address="+address,
                null);

        System.out.println(uri);

        URL url = uri.toURL();
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))
        ) {
            Gson gson = new GsonBuilder().create();
            Indeksas indeksas = gson.fromJson(in,Indeksas.class);
            System.out.println(indeksas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
