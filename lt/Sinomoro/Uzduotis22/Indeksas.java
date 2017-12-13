package lt.Sinomoro.Uzduotis22;

import java.util.List;

public class Indeksas {
   private List<Data> data;
    @Override
    public String toString() {
        //galima papildyti isvedimo koda, taip, kad rasytu visus surastus adresus, o ne tik pirmajy, pasinaudojus for each ciklu, bet uzduotyje to neprase
        if (data.size() > 0)
        {
            return data.get(0).city + " " + data.get(0).address + " indeksas yra : " + data.get(0).post_code;
        }
        else
        {
            return "Invalid link";
        }
    }

    private class Data{
        private String post_code;
        private String address;
        private String city;
    }
}
