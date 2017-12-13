package lt.Sinomoro.Uzduotis22;

import java.util.List;

public class Indeksas {
   private List<Data> data;
    @Override
    public String toString() {

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
